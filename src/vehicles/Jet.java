package vehicles;

public class Jet extends Vehicle {

    private int maximumAltitude;

    public Jet() {
    }

    public void takeOff(){
        System.out.println("Taking off...");
    }

    public Jet(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public Jet(boolean isOperable, int passengerCapacity, String powerSource, int maximumAltitude) {
        super(isOperable, passengerCapacity, powerSource);
        this.maximumAltitude = maximumAltitude;
    }

    public int getMaximumAltitude() {
        return maximumAltitude;
    }

    public void setMaximumAltitude(int maximumAltitude) {
        this.maximumAltitude = maximumAltitude;
    }

    public void turnOn(){
        System.out.println("Igniting jet engines...");
    }

    @Override
    public String toString() {
        return "Vehicle type: Jet" + "\n" +
                "Max altitude? " + maximumAltitude +
                "\n" + super.toString();
    }

    public static void main(String[] args) {

    }
}
