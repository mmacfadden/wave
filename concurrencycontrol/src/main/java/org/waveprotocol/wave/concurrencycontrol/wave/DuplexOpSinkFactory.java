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
package org.waveprotocol.wave.concurrencycontrol.wave;

import org.waveprotocol.wave.model.operation.wave.WaveletOperation;

import org.waveprotocol.wave.model.id.WaveletId;
import org.waveprotocol.wave.model.operation.SilentOperationSink;

/**
 * Factory for creating op taps
 *
 */
public interface DuplexOpSinkFactory {
  DuplexOpSink create(WaveletId waveletId, FlushingOperationSink<WaveletOperation> fromChannel,
      SilentOperationSink<? super WaveletOperation> toChannel);

  final DuplexOpSinkFactory PASS_THROUGH = new DuplexOpSinkFactory() {
    @Override
    public DuplexOpSink create(WaveletId waveletId,
        final FlushingOperationSink<WaveletOperation> fromChannel,
        final SilentOperationSink<? super WaveletOperation> toChannel) {
      return new DuplexOpSink() {
        @Override
        public FlushingOperationSink<WaveletOperation> incoming() {
          return fromChannel;
        }

        @Override
        public SilentOperationSink<? super WaveletOperation> outgoing() {
          return toChannel;
        }
      };
    }};
}
