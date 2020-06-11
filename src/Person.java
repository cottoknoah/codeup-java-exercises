public class Person {

    // this is pointing at the Object / Instance

    private String name;

    //this is the constructor
    public Person (String name) {
        this.name = name;
        //property name and pass the argument??
    }

    //used primarily in another class not in the same class
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name property to the passed value
        this.name = name;
        //takes value and then assign to name - change

    }

    public void sayHello() {
//TODO: print a message to the console using the person's name
        System.out.println(this.name + " says hi!");
    }

    public static void main(String[] args) {
//        Person p = new Person("Bob");
//        Person p2 = new Person("Bob");
//        System.out.println(p);
//        System.out.println(p.getName());
//        p.sayHello();
//        p.setName("Knoah");
//        p.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); // false

        //===============the double equals compares the values!

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        //=========pointing to the same object

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

        //referencing the same ID

    }

}