package design.patterns.examples.creational.abstract_factory.first.impl.fact;

import design.patterns.examples.creational.abstract_factory.first.core.EuropeanMovie;
import design.patterns.examples.creational.abstract_factory.first.core.HollywoodMovie;
import design.patterns.examples.creational.abstract_factory.first.core.MovieFactory;
import design.patterns.examples.creational.abstract_factory.first.impl.EuropeanComedyMovie;
import design.patterns.examples.creational.abstract_factory.first.impl.HollywoodComedyMovie;

public class ComedyMovieFactory implements MovieFactory {

    @Override
    public HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }

    @Override
    public EuropeanMovie getEuropeanMovie() {
        return new EuropeanComedyMovie();
    }
}
