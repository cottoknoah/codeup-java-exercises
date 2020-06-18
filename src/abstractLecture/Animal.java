package abstractLecture;

abstract class Animal {
    int age;
    String habitat;
    String species;

    public void sayHello(){
        System.out.println("You greet the animal");
    }

    public abstract void eat(); // cannot create implementation or a body for this
    public abstract void sleep();

}
