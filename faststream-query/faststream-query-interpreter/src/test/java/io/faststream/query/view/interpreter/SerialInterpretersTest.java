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
package io.faststream.query.view.interpreter;

import java.util.List;

import org.junit.Test;

import io.faststream.query.util.view.CollectionView;
import io.faststream.query.view.interpreter.ViewInterpreters;
import io.faststream.sisyphus.view.CollectionViewRandomTestBuilder;

/**
 * 
 * @author Kasper Nielsen
 */
public class SerialInterpretersTest {

    @Test
    public void createCollectionView() {
        CollectionViewRandomTestBuilder<Integer> builder = new CollectionViewRandomTestBuilder<Integer>() {
            @Override
            protected CollectionView<Integer> createTestStructure(List<Integer> bootstrap) {
                return ViewInterpreters.createCollectionView(bootstrap);
            }
        };
        builder.start(100000);
    }
}
