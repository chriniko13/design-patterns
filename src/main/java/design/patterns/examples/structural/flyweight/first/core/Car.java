package design.patterns.examples.structural.flyweight.first.core;

public class Car implements Vehicle {

    private final String vehicleType;
    private String color;

    {
        vehicleType = Car.class.getSimpleName();
    }

    @Override
    public void showDetails() {
        System.out.println("vehicleType = " + vehicleType + ", color = " + color);
    }

    @Override
    public void setColor(String color /* extrinsic state */) {
        this.color = color;
    }
}
