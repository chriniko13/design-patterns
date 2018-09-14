package design.patterns.examples.structural.bridge.first.core;

public class GreenColor implements Color {

    @Override
    public void apply() {
        System.out.println("green.");
    }
}
