package appliances;

abstract class Blender extends Appliance {

    @Override
    public void makeSound() {
        System.out.println("Crunch slush crunch...");
    }

    @Override
    public void doWork() {
        System.out.println("Blending items.");
    }
}
