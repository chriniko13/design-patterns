package design.patterns.examples.behavioral.iterator.first.core;

public interface Subject<T> {

    Iterator<T> getIterator();
}
