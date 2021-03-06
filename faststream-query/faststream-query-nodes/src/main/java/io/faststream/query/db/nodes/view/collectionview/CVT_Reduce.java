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
import java.util.function.BinaryOperator;

import io.faststream.query.db.query.node.QueryOperationNode;
import io.faststream.query.db.query.node.QueryOperationNodeDefinition;
import io.faststream.query.db.query.node.TerminalQueryOperationNode;
import io.faststream.query.db.query.node.defaults.CollectionQueryOperations;

@SuppressWarnings("rawtypes")
public class CVT_Reduce extends TerminalQueryOperationNode implements CollectionViewVisitable {

    private static final long serialVersionUID = 1L;

    private final BinaryOperator reducer;

    public CVT_Reduce(QueryOperationNode parent, BinaryOperator reducer) {
        super(parent);
        this.reducer = Objects.requireNonNull(reducer, "reducer is null");
    }

    public QueryOperationNodeDefinition getOperationPackage() {
        return QueryOperationNodeDefinition.create(CollectionQueryOperations.CT_REDUCE_OPERATOR, "reducer", BinaryOperator.class);
    }

    public String name() {
        return "reduce";
    }

    public int getNodeId() {
        return 6;
    }

    @Override
    public final int getNodeType() {
        return 1;
    }

    public BinaryOperator getReducer() {
        return reducer;
    }

    public void accept(CollectionViewVisitable.CollectionViewVisitor visitor) {
        visitor.reduce(this);
    }
}
