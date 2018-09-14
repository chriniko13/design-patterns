package design.patterns.examples.structural.bridge.first.core;

public abstract class Shape {

    // Composition - implementor
    protected Color color;

    Shape(Color color) {
        this.color = color;
    }

    public abstract void applyColor();
}
