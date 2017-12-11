package design.patterns.examples.structural.flyweight.first.core;

import java.util.LinkedHashMap;
import java.util.Map;

public class VehicleFactory {

    private static final Map<String, Vehicle> VEHICLES;

    static {
        VEHICLES = new LinkedHashMap<>();
    }

    public static int getVehiclesCount() {
        return VEHICLES.size();
    }

    public static Vehicle getVehicle(String vehicleType /* intrinsic data */) {

        Vehicle vehicle = VEHICLES.get(vehicleType);

        if (vehicle != null) {
            return vehicle;
        } else {

            String carType = Car.class.getSimpleName();
            String motorcycleType = Motorcycle.class.getSimpleName();

            if (vehicleType.equals(carType)) {

                Vehicle car = new Car();
                VEHICLES.put(carType, car);
                return car;

            } else if (vehicleType.equals(motorcycleType)) {

                Vehicle motorcycle = new Motorcycle();
                VEHICLES.put(motorcycleType, motorcycle);
                return motorcycle;

            } else {
                throw new IllegalStateException("Provided vehicle type is not supported.");
            }

        }

    }

}
