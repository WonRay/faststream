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
package io.faststream.query.db.nodes.stream.longstream;

/**
 * This class has been autogenerated
 *
 * @author Kasper Nielsen
 */
import java.util.LongSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import io.faststream.query.db.nodes.stream.StreamContext;
import io.faststream.query.db.query.node.EmptyResult;
import io.faststream.query.db.query.node.QueryOperationNode;
import io.faststream.query.db.query.node.QueryOperationNodeDefinition;
import io.faststream.query.db.query.node.TerminalQueryOperationNodeProcessor;

@SuppressWarnings({"rawtypes", "unchecked" })
public abstract class AbstractLongStream extends QueryOperationNode implements LongStream {

    private static final long serialVersionUID = 1L;

    private final StreamContext context;

    public AbstractLongStream(QueryOperationNode previous, StreamContext context) {
        super(previous);
        this.context = context;
    }

    public AbstractLongStream(TerminalQueryOperationNodeProcessor processor) {
        super(processor);
        this.context = new StreamContext();
    }

    public boolean allMatch(LongPredicate longPredicate) {
        return (Boolean) new SLT_AllMatch(this, context, longPredicate).process();
    }

    public boolean anyMatch(LongPredicate longPredicate) {
        return (Boolean) new SLT_AnyMatch(this, context, longPredicate).process();
    }

    public DoubleStream asDoubleStream() {
        return new SL_AsDoubleStream(this, context);
    }

    public OptionalDouble average() {
        Object result = new SLT_Average(this, context).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalDouble.empty();
        }
        return OptionalDouble.of((Double) result);
    }

    public Stream boxed() {
        return new SL_Boxed(this, context);
    }

    public void close() {
        context.close();
    }

    public Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return new SLT_Collect(this, context, supplier, objLongConsumer, biConsumer).process();
    }

    public long count() {
        return (Long) new SLT_Count(this, context).process();
    }

    public LongStream distinct() {
        return new SL_Distinct(this, context);
    }

    public LongStream filter(LongPredicate longPredicate) {
        return new SL_Filter(this, context, longPredicate);
    }

    public OptionalLong findAny() {
        Object result = new SLT_FindAny(this, context).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalLong.empty();
        }
        return OptionalLong.of((Long) result);
    }

    public OptionalLong findFirst() {
        Object result = new SLT_FindFirst(this, context).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalLong.empty();
        }
        return OptionalLong.of((Long) result);
    }

    public LongStream flatMap(LongFunction mapper) {
        return new SL_FlatMap(this, context, mapper);
    }

    public void forEach(LongConsumer action) {
        new SLT_ForEach(this, context, action).process();
    }

    public void forEachOrdered(LongConsumer action) {
        new SLT_ForEachOrdered(this, context, action).process();
    }

    public boolean isParallel() {
        return false;
    }

    public PrimitiveIterator.OfLong iterator() {
        return (PrimitiveIterator.OfLong) new SLT_Iterator(this, context).process();
    }

    public LongStream limit(long maxSize) {
        return new SL_Limit(this, context, maxSize);
    }

    public LongStream map(LongUnaryOperator longUnaryOperator) {
        return new SL_Map(this, context, longUnaryOperator);
    }

    public DoubleStream mapToDouble(LongToDoubleFunction mapper) {
        return new SL_MapToDouble(this, context, mapper);
    }

    public IntStream mapToInt(LongToIntFunction mapper) {
        return new SL_MapToInt(this, context, mapper);
    }

    public Stream mapToObj(LongFunction mapper) {
        return new SL_MapToObj(this, context, mapper);
    }

    public OptionalLong max() {
        Object result = new SLT_Max(this, context).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalLong.empty();
        }
        return OptionalLong.of((Long) result);
    }

    public OptionalLong min() {
        Object result = new SLT_Min(this, context).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalLong.empty();
        }
        return OptionalLong.of((Long) result);
    }

    public boolean noneMatch(LongPredicate longPredicate) {
        return (Boolean) new SLT_NoneMatch(this, context, longPredicate).process();
    }

    public LongStream onClose(Runnable runnable) {
        context.onClose(runnable);
        return this;
    }

    public LongStream parallel() {
        return new SL_Parallel(this, context);
    }

    public LongStream peek(LongConsumer longConsumer) {
        return new SL_Peek(this, context, longConsumer);
    }

    public OptionalLong reduce(LongBinaryOperator op) {
        Object result = new SLT_Reduce(this, context, op).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return OptionalLong.empty();
        }
        return OptionalLong.of((Long) result);
    }

    public long reduce(long identity, LongBinaryOperator op) {
        Object result = new SLT_Reduce(this, context, op).process();
        if (result == EmptyResult.EMPTY_RESULT) {
            return identity;
        }
        return (Long) result;
    }

    public LongStream sequential() {
        return new SL_Sequential(this, context);
    }

    public LongStream skip(long n) {
        return new SL_Skip(this, context, n);
    }

    public LongStream sorted() {
        return new SL_Sorted(this, context);
    }

    public Spliterator.OfLong spliterator() {
        return (Spliterator.OfLong) new SLT_Spliterator(this, context).process();
    }

    public long sum() {
        return (Long) new SLT_Sum(this, context).process();
    }

    public LongSummaryStatistics summaryStatistics() {
        return (LongSummaryStatistics) new SLT_SummaryStatistics(this, context).process();
    }

    public long[] toArray() {
        return (long[]) new SLT_ToArray(this, context).process();
    }

    public LongStream unordered() {
        return new SL_Unordered(this, context);
    }

    public static  LongStream from(TerminalQueryOperationNodeProcessor processor) {
        return new DefaultLongStream(processor);
    }

    static final class DefaultLongStream extends AbstractLongStream {

        private static final long serialVersionUID = 1L;

        DefaultLongStream(TerminalQueryOperationNodeProcessor processor) {
            super(processor);
        }

        public final int getNodeId() {
            return -4;
        }

        @Override
        public final int getNodeType() {
            return 4;
        }

        @Override
        public final String name() {
            return "root";
        }

        @Override
        public final QueryOperationNodeDefinition getOperationPackage() {
            return null;
        }
    }
}
