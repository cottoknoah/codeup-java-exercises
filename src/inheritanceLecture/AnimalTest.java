package inheritanceLecture;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();

//        a.setAge(100);
//        a.setSpecies("Primate");
//        a.makeNoise();

        d.setAge(5);
        d.setSpecies("Canine");
        d.setBreed("Pug");
        d.makeNoise();
        d.makeGenericAnimalNoise();
//
//        c.setAge(6);
//        c.setSpecies("Feline");


//        a.makeNoise();
//        d.makeNoise();
//        c.makeNoise();

//        System.out.println(a.toString());
//
//        System.out.println("==============");
//
        System.out.println(d.toString());
//
//        System.out.println("==============");
//
//        System.out.println(c.toString());
    }
}
