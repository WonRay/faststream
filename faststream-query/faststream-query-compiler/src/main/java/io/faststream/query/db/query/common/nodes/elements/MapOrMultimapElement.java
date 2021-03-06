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
package io.faststream.query.db.query.common.nodes.elements;

import io.faststream.query.db.query.plan.logical.LogicalElementProperties;

/**
 *
 * @author Kasper Nielsen
 */
public abstract class MapOrMultimapElement extends RealNode {
    private LogicalElementProperties key;

    private LogicalElementProperties value;

    public final LogicalElementProperties getKey() {
        return key;
    }

    public final LogicalElementProperties getValue() {
        return value;
    }

    public final void setKey(LogicalElementProperties key) {
        this.key = key;
    }

    public final void setValue(LogicalElementProperties value) {
        this.value = value;
    }
}
