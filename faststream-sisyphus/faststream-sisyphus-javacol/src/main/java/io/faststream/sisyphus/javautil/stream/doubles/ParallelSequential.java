/*
 * Copyright (c) 2008 Kasper Nielsen.
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
package io.faststream.sisyphus.javautil.stream.doubles;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;

import io.faststream.sisyphus.annotations.RndTest;

/**
 *
 * @author Kasper Nielsen
 */
public class ParallelSequential extends AbstractRandomDoubleStreamTestCase {

    @RndTest
    public void parallel() {
        nested(expected().withParallel(true), actual().parallel());
    }

    @RndTest
    public void sequential() {
        nested(expected().withParallel(false), actual().sequential());
    }

    @RndTest
    @Ignore
    public void isParallel() {
        assertEquals(expected().isParallel(), actual().isParallel());
    }
}
