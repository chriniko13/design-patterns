package design.patterns.examples.creational.abstract_factory.first.impl;

import design.patterns.examples.creational.abstract_factory.first.core.HollywoodMovie;

public class HollywoodActionMovie implements HollywoodMovie {

    @Override
    public String name() {
        return "Mission Impossible: Rogue Nation is a hollywood action movie.";
    }
}
