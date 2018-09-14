package design.patterns.examples.creational.abstract_factory.first.impl;

import design.patterns.examples.creational.abstract_factory.first.core.HollywoodMovie;

public class HollywoodComedyMovie implements HollywoodMovie {

    @Override
    public String name() {
        return "We are the Millers is a hollywood comedy movie.";
    }
}
