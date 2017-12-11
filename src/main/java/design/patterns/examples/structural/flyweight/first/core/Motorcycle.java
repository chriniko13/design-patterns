package design.patterns.examples.structural.flyweight.first.core;

public class Motorcycle implements Vehicle {

    private final String vehicleType;
    private String color;

    {
        vehicleType = Motorcycle.class.getSimpleName();
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
