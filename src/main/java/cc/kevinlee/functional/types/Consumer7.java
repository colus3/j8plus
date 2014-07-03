/**
 * Copyright 2014 Seong Hyun (Kevin)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cc.kevinlee.functional.types;

import java.util.Objects;

/**
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2014-06-30)
 * @param <T1>
 *          input1
 * @param <T2>
 *          input2
 * @param <T3>
 *          input3
 * @param <T4>
 *          input4
 * @param <T5>
 *          input5
 * @param <T6>
 *          input6
 * @param <T7>
 *          input7
 */
@FunctionalInterface
public interface Consumer7<T1, T2, T3, T4, T5, T6, T7> {
  void accept(T1 input1, T2 input2, T3 input3, T4 input4, T5 input5, T6 input6, T7 input7);

  /**
   * Returns a composed {@code Consumer} that performs, in sequence, this operation followed by the {@code after}
   * operation. If performing either operation throws an exception, it is relayed to the caller of the composed
   * operation. If performing this operation throws an exception, the {@code after} operation will not be performed.
   *
   * @param after
   *          the operation to perform after this operation
   * @return a composed {@code Consumer} that performs in sequence this operation followed by the {@code after}
   *         operation
   * @throws NullPointerException
   *           if {@code after} is null
   */
  default Consumer7<T1, T2, T3, T4, T5, T6, T7> andThen(
      Consumer7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> after) {
    Objects.requireNonNull(after);
    return (input1, input2, input3, input4, input5, input6, input7) -> {
      accept(input1, input2, input3, input4, input5, input6, input7);
      after.accept(input1, input2, input3, input4, input5, input6, input7);
    };
  }
}