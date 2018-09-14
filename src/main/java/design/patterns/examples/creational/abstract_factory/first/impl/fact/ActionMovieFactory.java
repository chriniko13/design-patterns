package design.patterns.examples.creational.abstract_factory.first.impl.fact;

import design.patterns.examples.creational.abstract_factory.first.core.EuropeanMovie;
import design.patterns.examples.creational.abstract_factory.first.core.HollywoodMovie;
import design.patterns.examples.creational.abstract_factory.first.core.MovieFactory;
import design.patterns.examples.creational.abstract_factory.first.impl.EuropeanActionMovie;
import design.patterns.examples.creational.abstract_factory.first.impl.HollywoodActionMovie;

public class ActionMovieFactory implements MovieFactory {

    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    public EuropeanMovie getEuropeanMovie() {
        return new EuropeanActionMovie();
    }
}
