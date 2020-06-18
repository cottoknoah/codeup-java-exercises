package inheritanceLecture;

public class Dog extends Animal{

    private String breed;

//    public static void main(String[] args) { }

    public String getBreed() { return breed; }

    public void setBreed(String breed) { this.breed = breed; }

    public void makeNoise(){
        System.out.println("BARK Bark Bark!!!!");
    }

    public void makeGenericAnimalNoise() {
        super.makeNoise();
    }

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "species='" + this.getSpecies() + '\'' +
//                ", age=" + this.getAge() +
//                ", breed='" + breed + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }

}
