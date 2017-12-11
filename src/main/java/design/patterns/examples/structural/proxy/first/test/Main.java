package design.patterns.examples.structural.proxy.first.test;

import design.patterns.examples.structural.proxy.first.core.Engine;
import design.patterns.examples.structural.proxy.first.core.EngineChecker;

public class Main {

    public static void main(String[] args) {

        Engine engine = new EngineChecker();
        engine.start();

    }

}
