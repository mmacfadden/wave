/**
 * Copyright 2009 Google Inc.
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

package org.waveprotocol.wave.model.util;

/**
 * A scheduler that can be used for scheduling a single task. The most common use case
 * is having a scheduler that backs off the more you call schedule.
 *
 * @author zdwang@google.com (David Wang)
 */
public interface Scheduler {

  /** Simple command that can be invoked */
  public interface Command {
    void execute();
  }

  /**
   * Resets the backoff time and resets the scheduled job.
   */
  void reset();

  /**
   * Schedules a task to be ran in the future. If a previous task was
   * scheduled, it's cancelled.
   *
   * @param task the task to schedule
   * @return true if the task was scheduled, or false if it was rejected
   */
  boolean schedule(Command task);
}
