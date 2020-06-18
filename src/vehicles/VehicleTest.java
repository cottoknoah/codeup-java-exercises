package vehicles;

import java.util.ArrayList;

public class VehicleTest {


    public void turnOnAllVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            v.turnOn();
        }
    }

    public static void main(String[] args) {

        Vehicle v = new Vehicle(
                true,
                6,
                "gas");

//        Car c = new Car(false, 5, "electric");
//
//        Jet j = new Jet(true, 25, "gas");

        // creating an array to hold any object that extends from type animal
        Vehicle[] vehicles = new Vehicle[2];
//        vehicles[0] = c; // assign our car object
//        vehicles[1] = j; // assign our jet object


        // example of casting to use a sub-type specific field
        Car car = (Car) vehicles[0];
        car.turnOn();


//        turnOnAllVehicles(vehicles); // calling a method that uses array of animals


//        v.setOperable(false);
//        v.setPassengerCapacity(4);
//        v.setPowerSource("gas");

//        c.setOperable(true);
//        c.setPassengerCapacity(5);
//        c.setPowerSource("electric");
//        c.setMilesPerGallon(59);
//
//        j.setOperable(true);
//        j.setPassengerCapacity(15);
//        j.setPowerSource("electric");
//        j.setMaximumAltitude(20_000);

//        System.out.println(v.toString());
//
//        System.out.println("==========");

//        System.out.println(c.toString());
//        c.deployAirBag();
//
//        System.out.println("==========");
//
//        System.out.println(j.toString());
//        j.takeOff();
    }
}
