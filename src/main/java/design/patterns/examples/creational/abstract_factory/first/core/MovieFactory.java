package design.patterns.examples.creational.abstract_factory.first.core;

public interface MovieFactory {

    HollywoodMovie getHollywoodMovie();

    EuropeanMovie getEuropeanMovie();
}
