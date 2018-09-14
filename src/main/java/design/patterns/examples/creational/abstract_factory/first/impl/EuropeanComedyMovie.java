package design.patterns.examples.creational.abstract_factory.first.impl;

import design.patterns.examples.creational.abstract_factory.first.core.EuropeanMovie;

public class EuropeanComedyMovie implements EuropeanMovie {

    @Override
    public String name() {
        return "Asterix and Obelix vs Caesar is a european comedy movie.";
    }
}
