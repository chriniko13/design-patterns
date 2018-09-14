package design.patterns.examples.creational.abstract_factory.first.test;

import design.patterns.examples.creational.abstract_factory.first.core.MovieFactory;
import design.patterns.examples.creational.abstract_factory.first.impl.fact.ActionMovieFactory;
import design.patterns.examples.creational.abstract_factory.first.impl.fact.ComedyMovieFactory;

public class Main {

    public static void main(String[] args) {

        MovieFactory actionMovieFactory = new ActionMovieFactory();
        System.out.println(actionMovieFactory.getEuropeanMovie().name());
        System.out.println(actionMovieFactory.getHollywoodMovie().name());

        System.out.println();

        MovieFactory comedyMovieFactory = new ComedyMovieFactory();
        System.out.println(comedyMovieFactory.getHollywoodMovie().name());
        System.out.println(comedyMovieFactory.getEuropeanMovie().name());

    }
}
