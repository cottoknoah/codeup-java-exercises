package appliances;

/*#### Mini-Exercise 2 (Abstract Classes)
        - Create an abstract class called Appliance with the following properties:
        - package-private brand;
        - package-private color;
        - an empty constructor and a constructor that sets the properties.
        - getters and setters for properties.
        - an abstract method named makeSound() - when implemented, prints the sound the appliance makes
        - an abstract method named doWork()- when implemented, prints what the appliance does
        - Create a concrete class of Refrigerator that extends Appliance. Implement all abstract methods.
        - Create a concrete class of Blender that extends Appliance. Implement all abstract methods.
        - Come up with your own concrete class to extend Appliance and implement abstract methods.
*/
abstract class Appliance {

    String brand;
    String color;

    //empty constructor
    public Appliance(){
    }

    //constructor
    public Appliance(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //abstract method
    public abstract void makeSound();

    public abstract void doWork();

}
