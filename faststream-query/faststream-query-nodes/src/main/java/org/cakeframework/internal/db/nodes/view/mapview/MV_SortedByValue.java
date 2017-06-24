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
/* 
 * This class was automatically generated by cake.bootstrap.view.GenerateAll 
 * Available in the https://github.com/cakeframework/cake-developers/ project 
 */
package org.cakeframework.internal.db.nodes.view.mapview;

/**
 * This class has been autogenerated
 *
 * @author Kasper Nielsen
 */
import java.util.Comparator;
import java.util.Objects;

import org.cakeframework.internal.db.query.node.QueryOperationNode;
import org.cakeframework.internal.db.query.node.QueryOperationNodeDefinition;
import org.cakeframework.internal.db.query.node.defaults.MapQueryOperations;

@SuppressWarnings("rawtypes")
public class MV_SortedByValue extends AbstractMapView implements MapViewVisitable {

    private static final long serialVersionUID = 1L;

    private final Comparator comparator;

    public MV_SortedByValue(QueryOperationNode parent, Comparator comparator) {
        super(parent);
        this.comparator = Objects.requireNonNull(comparator, "comparator is null");
    }

    public QueryOperationNodeDefinition getOperationPackage() {
        return QueryOperationNodeDefinition.create(MapQueryOperations.M_SORTED_BY_VALUE_COMPARATOR, "comparator", Comparator.class);
    }

    public String name() {
        return "sortedByValue";
    }

    public int getNodeId() {
        return 16;
    }

    @Override
    public final int getNodeType() {
        return 6;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void accept(MapViewVisitable.MapViewVisitor visitor) {
        visitor.sortedByValue(this);
    }
}