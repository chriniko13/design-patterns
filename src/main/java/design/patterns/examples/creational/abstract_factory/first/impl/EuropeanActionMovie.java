package design.patterns.examples.creational.abstract_factory.first.impl;

import design.patterns.examples.creational.abstract_factory.first.core.EuropeanMovie;

public class EuropeanActionMovie implements EuropeanMovie {
    @Override
    public String name() {
        return "The Invisible Guest is a european action movie.";
    }
}
