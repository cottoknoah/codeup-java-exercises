package vehicles;

public class Car extends Vehicle {

    private int milesPerGallon;

    public Car() {
    }

    public Car(boolean isOperable, int passengerCapacity, String powerSource, int milesPerGallon) {
        super(isOperable, passengerCapacity, powerSource);
        this.milesPerGallon = milesPerGallon;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public void deployAirBag() {
        System.out.println("Deploying airbag...");
    }

    public void turnOn() {
        System.out.println("Cranking engine...");
    }

    @Override
    public String toString() {
        return "Vehicle type: Car " + "\n" +
                "MPG? " + milesPerGallon +
                "\n" + super.toString();
    }

    public static void main(String[] args) {

    }
}