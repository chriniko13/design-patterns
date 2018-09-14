package design.patterns.examples.structural.bridge.first.test;

import design.patterns.examples.structural.bridge.first.core.*;

public class Main {

    public static void main(String[] args) {

        Shape pentagon = new Pentagon(new RedColor());
        pentagon.applyColor();

        Shape triangle = new Triangle(new GreenColor());
        triangle.applyColor();
    }
}
