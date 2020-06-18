import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //creates template - space to have three persons
        Person[] persons = new Person[3];
        persons[0] = new Person("Knoah");
        persons[1] = new Person("Greg");
        persons[2] = new Person("Will");

        //part of 2
        Person[] newPersons = addPerson(persons, new Person("Maddie"));

// Iterate through the array and print out the name of each person in the array.
//    for (Person person : persons){  //for each loop
        for (int i = 0; i < newPersons.length; i++) {
            System.out.println(newPersons[i].getName());
        }
    }
    //passing two arguments: array you already have + a new person
    //use the same return type
    public static Person[] addPerson(Person[] persons, Person person) {
        Person[] newPersons = new Person[persons.length + 1];

        for (int i = 0; i < newPersons.length; i++) {
            if (i == newPersons.length - 1) {
                //if we hit the last index
                newPersons[i] = person;
            } else {
                newPersons[i] = persons[i];
            }
        }
        return newPersons;
    }
}
