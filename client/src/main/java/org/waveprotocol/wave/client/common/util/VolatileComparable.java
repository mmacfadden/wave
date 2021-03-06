/**
 * Copyright 2008 Google Inc.
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

package org.waveprotocol.wave.client.common.util;

/**
 * Interface for volatile objects that may or may not be comparable to one another at any given
 * moment.  The volatility must be monotonic: one it is incomparable, it will never again be
 * comparable.
 *
 * @author danilatos@google.com (Daniel Danilatos)
 */
public interface VolatileComparable<T> extends Comparable<T> {

  /**
   * @return true if it makes sense for this object to be compared to a similar object.
   */
  boolean isComparable();
}
