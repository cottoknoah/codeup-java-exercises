package appliances;

public class Refrigerator extends Appliance{

    public Refrigerator(String brand, String color){
        super(brand, color);
    }


    @Override
    public void makeSound() {
        System.out.println("Buzzz...");
    }

    @Override
    public void doWork() {
        System.out.println("Cooling products.");

    }
}
