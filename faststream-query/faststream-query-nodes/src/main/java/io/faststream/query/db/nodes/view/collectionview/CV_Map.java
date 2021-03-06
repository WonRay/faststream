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
package io.faststream.query.db.nodes.view.collectionview;

/**
 * This class has been autogenerated
 *
 * @author Kasper Nielsen
 */
import java.util.Objects;
import java.util.function.Function;

import io.faststream.query.db.query.node.QueryOperationNode;
import io.faststream.query.db.query.node.QueryOperationNodeDefinition;
import io.faststream.query.db.query.node.defaults.CollectionQueryOperations;

@SuppressWarnings("rawtypes")
public class CV_Map extends AbstractCollectionView implements CollectionViewVisitable {

    private static final long serialVersionUID = 1L;

    private final Function mapper;

    public CV_Map(QueryOperationNode parent, Function mapper) {
        super(parent);
        this.mapper = Objects.requireNonNull(mapper, "mapper is null");
    }

    public QueryOperationNodeDefinition getOperationPackage() {
        return QueryOperationNodeDefinition.create(CollectionQueryOperations.C_MAP_TO_OBJECT, "mapper", Function.class);
    }

    public String name() {
        return "map";
    }

    public int getNodeId() {
        return 8;
    }

    @Override
    public final int getNodeType() {
        return 1;
    }

    public Function getMapper() {
        return mapper;
    }

    public void accept(CollectionViewVisitable.CollectionViewVisitor visitor) {
        visitor.map(this);
    }
}
