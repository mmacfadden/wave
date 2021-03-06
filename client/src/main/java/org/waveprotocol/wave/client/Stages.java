/**
 * Copyright 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.waveprotocol.wave.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.Command;

import org.waveprotocol.wave.client.common.util.AsyncHolder;
import org.waveprotocol.wave.client.common.util.AsyncHolder.Accessor;

/**
 * Loads Undercurrent's stages in order.
 *
 */
public abstract class Stages {

  /** Continuation for when the last stage is loaded. */
  private Command whenFinished;

  /**
   * Creates a new stage loading sequence.
   */
  public Stages() {
  }

  /** @return the provider that loads stage zero. */
  protected AsyncHolder<StageZero> createStageZeroLoader() {
    return new StageZero.DefaultProvider();
  }

  /** @return the provider that loads stage one. */
  protected AsyncHolder<StageOne> createStageOneLoader(StageZero zero) {
    return new StageOne.DefaultProvider(zero);
  }

  /** @return the provider that loads stage two. */
  protected abstract AsyncHolder<StageTwo> createStageTwoLoader(StageOne one);

  /** @return the provider that loads stage three. */
  protected AsyncHolder<StageThree> createStageThreeLoader(StageTwo two) {
    return new StageThree.DefaultProvider(two);
  }

  /**
   * Initiates the load sequence.
   *
   * @param whenFinished optional command to run once the last stage is loaded
   */
  public final void load(Command whenFinished) {
    this.whenFinished = whenFinished;
    loadStageZero();
  }

  private void loadStageZero() {
    createStageZeroLoader().call(new Accessor<StageZero>() {
      @Override
      public void use(StageZero x) {
        loadStageOne(x);
      }
    });
  }

  private void loadStageOne(final StageZero zero) {
    createStageOneLoader(zero).call(new Accessor<StageOne>() {
      @Override
      public void use(StageOne x) {
        loadStageTwo(x);
      }
    });
  }


  private void loadStageTwo(final StageOne one) {
    GWT.runAsync(new SimpleAsyncCallback() {
      @Override
      public void onSuccess() {
        createStageTwoLoader(one).call(new Accessor<StageTwo>() {
          @Override
          public void use(StageTwo x) {
            loadStageThree(x);
          }
        });
      }
    });
  }

  private void loadStageThree(final StageTwo two) {
    GWT.runAsync(new SimpleAsyncCallback() {
      @Override
      public void onSuccess() {
        createStageThreeLoader(two).call(new Accessor<StageThree>() {
          @Override
          public void use(StageThree x) {
            finish();
          }
        });
      }
    });
  }

  private void finish() {
    if (whenFinished != null) {
      whenFinished.execute();
      whenFinished = null;
    }
  }

  private static abstract class SimpleAsyncCallback implements RunAsyncCallback {
    @Override
    public void onFailure(Throwable reason) {
      throw new RuntimeException(reason);
    }
  }
}
