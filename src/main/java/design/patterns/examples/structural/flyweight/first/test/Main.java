package design.patterns.examples.structural.flyweight.first.test;

import design.patterns.examples.structural.flyweight.first.core.Vehicle;
import design.patterns.examples.structural.flyweight.first.core.VehicleFactory;

import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Vehicle vehicle;
        /*Here we are trying to get 3 king type robots*/
        for (int i = 0; i < 3; i++) {
            vehicle = VehicleFactory.getVehicle("Motorcycle");
            vehicle.setColor(getRandomColor());
            vehicle.showDetails();
        }

        /*Here we are trying to get 3 queen type robots*/
        for (int i = 0; i < 3; i++) {
            vehicle = VehicleFactory.getVehicle("Car");
            vehicle.setColor(getRandomColor());
            vehicle.showDetails();
        }

        int vehiclesCount = VehicleFactory.getVehiclesCount();
        System.out.println("vehiclesCount: " + vehiclesCount);

    }

    private static String getRandomColor() {
        Random r = new Random();
         /*You can supply any number of your choice in nextInt argument.
         * we are simply checking the random number generated is an even number
         * or an odd number. And based on that we are choosing the color. For
        simplicity, we'll use only two colors—red and green
         */
        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
