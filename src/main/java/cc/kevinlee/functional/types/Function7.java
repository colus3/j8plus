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
import java.util.function.Function;

/**
 * @author Lee, SeongHyun (Kevin)
 * @version 0.0.1 (2010-11-13)
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
 * @param <R>
 *          result
 */
@FunctionalInterface
public interface Function7<T1, T2, T3, T4, T5, T6, T7, R> {
  R apply(final T1 input1, final T2 input2, final T3 input3, final T4 input4, final T5 input5, final T6 input6, final T7 input7);

  /**
   * Returns a composed function that first applies this function to its input, and then applies the {@code after}
   * function to the result. If evaluation of either function throws an exception, it is relayed to the caller of the
   * composed function.
   *
   * @param <V>
   *          the type of output of the {@code after} function, and of the composed function
   * @param after
   *          the function to apply after this function is applied
   * @return a composed function that first applies this function and then applies the {@code after} function
   * @throws NullPointerException
   *           if after is null
   */
  default <V> Function7<T1, T2, T3, T4, T5, T6, T7, V> andThen(final Function<? super R, ? extends V> after) {
    Objects.requireNonNull(after);
    /* @formatter:off */
    return (input1, input2, input3, input4, input5, input6, input7) ->
                after.apply(apply(input1, input2, input3, input4, input5, input6, input7));
    /* @formatter:on */
  }
}
