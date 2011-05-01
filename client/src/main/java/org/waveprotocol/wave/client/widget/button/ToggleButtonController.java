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

package org.waveprotocol.wave.client.widget.button;

import org.waveprotocol.wave.client.widget.button.ToggleButton.ToggleButtonListener;

/**
 * Interface for controlling a toggle button.
 *
 */
public interface ToggleButtonController extends Disableable {
  /**
   * Changes the state of the toggle button without firing the listeners on it.
   *
   * @param isOn Whether or not the toggle button should be on.
   */
  void setOn(boolean isOn);

  /**
   * @param listener The listener for events sent from this toggle button.
   */
  void setToggleListener(ToggleButtonListener listener);
}
