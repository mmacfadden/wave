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

package org.waveprotocol.wave.model.operation;

import org.waveprotocol.wave.model.operation.Operation;
import org.waveprotocol.wave.model.operation.OperationException;
import org.waveprotocol.wave.model.operation.OperationSink;

/**
 * As per {@link OperationSink} but provides an ability to return the reverse
 * operation.
 *
 * @author thorogood@google.com (Sam Thorogood)
 */
public interface ReversingOperationSink<T extends Operation<?>> {

  /**
   * Consumes an operation and returns the single reverse operation.
   */
  T consumeAndReturnReverse(T op) throws OperationException;

}
