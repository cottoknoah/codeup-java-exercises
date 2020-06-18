package abstractLecture;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("Eat...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep...");
    }
}
