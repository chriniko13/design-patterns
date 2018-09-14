package design.patterns.examples.structural.bridge.first.core;

public class RedColor implements Color {

    @Override
    public void apply() {
        System.out.println("red.");
    }
}
