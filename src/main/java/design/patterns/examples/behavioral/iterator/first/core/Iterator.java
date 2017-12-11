package design.patterns.examples.behavioral.iterator.first.core;

public interface Iterator<T> {

    T first();

    T last();

    T next();

    T current();

    boolean isDone();

    void reset();
}
