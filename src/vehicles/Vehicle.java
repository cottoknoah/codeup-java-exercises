package vehicles;
/*Create a Vehicle class:
        - add the following private properties:
        1. boolean isOperable (intended to describe if the vehicle is functional or broken)
        2. int passengerCapacity (intended to describe how many people it can transport)
        3. String powerSource (intended to describe how the vehicle is powered, e.g. "gas", "electric", "nuclear", "human-effort", etc.)
        - add getters and setters for all properties, an empty constructor, and a constructor that sets all fields
        Create a Car class that extends Vehicle (no need to add anything to it yet)
        Create a Jet class that extends Vehicle (no need to add anything to it yet)
        Create a VehicleTest class
  - add a main method and create a Vehicle, Jet, and Car object,
  setting values for each and testing out the output of .toString() method for each
*/

public class Vehicle {

    private boolean isOperable;
    private int passengerCapacity;
    private String powerSource;

    public Vehicle(){
    }

    public Vehicle(boolean isOperable, int passengerCapacity, String powerSource) {
        this.isOperable = isOperable;
        this.passengerCapacity = passengerCapacity;
        this.powerSource = powerSource;
    }

    public boolean isOperable() {
        return isOperable;
    }

    public void setOperable(boolean operable) {
        isOperable = operable;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public void turnOn() {
        System.out.println("Vehicile is turning on...");
    }
        public String toString() {
        return "Vehicle operable? " + this.isOperable + "\nHow many passengers can it hold? " + this.passengerCapacity + "\nWhat power source does it use? " + this.powerSource;
    }

//    @Override
//    public String toString() {
//        return "Vehicle{" +
//                "isOperable=" + isOperable +
//                ", passengerCapacity=" + passengerCapacity +
//                ", powerSource='" + powerSource + '\'' +
//                '}';

}

