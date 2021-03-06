public class MethodsLecture {

//  METHODS

/*


A Method in Java has a few main components:
-visibility modifier

-static keyword (optional)

-Return type
-exits a function
--if it doesn't return anything it is void

-Name

-Parameters

-Body

-Public:
means other classes can see this method

-Static:
this method belongs to the class, not instances of it

-Void:
has no return

-Main:
method name

(String[] args):
-takes in an Array of Strings as arguments

*/
    public static String helloWorld() {
        System.out.println("Hello World");
        return "Hello World";
    }

    public static void greetCohort(String greeting, String cohort) {
//        return greeting + " "  + cohort;
        System.out.println(greeting + " "  + cohort);
    }
    public static void main(String[] args) {
//        invokes version 1
        orderFood();
//        invokes version 2
        orderFood("Pizza");
//        invokes version 3
        orderFood("Burgers",3);
//        invokes version 4
        orderFood("Sushi", "Ramen");

        String myGreeting = "Good Day";
        String cohort = "Olympic";

        greetCohort("Good Morning", "Ganymede");
        greetCohort("Hello", "Fortuna");
        greetCohort(myGreeting,cohort);
        greetCohort(myGreeting, "Deimos");
        System.out.println(helloWorld());
    }

/*
    TO DO TOGETHER: Write a public static method called orderFood that
    prints the message "I would like fries please."
 */
//version 1
    public static void orderFood(){

        System.out.println("I would like fries please");
    }
//version 2
    public static void orderFood(String food){

        System.out.printf("I would like %s please!\n", food);
    }
//version 3
    public static void orderFood(String food, int number){
    System.out.printf("I would like %s please!\n", number, food);
}
//version 4
    public static void orderFood(String item1, String item2){
        System.out.printf("I would like %s please!\n", item1, item2);
    }

/*
    TO DO: Create a main method in this class. Use it to call your
    orderFood method. Run the program to see the results.
 */

/*
    TO DO: Write a public static method called favoriteSong that prints
    your favorite song.
 */


/*
    TO DO: Write a public static method called weeksIn that prints
    message saying how many weeks you've been at Codeup.
 */

//  METHOD OVERLOADING

/*
    TO DO TOGETHER: Overload your orderFood method. Create a version that
    takes in one String parameter which can replace the item they are
    ordering.
 */

/*
    TO DO: Overload orderFood again. Create a version that takes in two
    parameters: a String replacing the item being ordered, and an int that
    represents how many of the item they would like to order. Display a new
    message using these arguments.
 */

/*
    TO DO TOGETHER: We'll overload orderFood again. We'll still have two
    parameters in this new version, however they will both be Strings
    representing two different items the customer wants. Let's display a
    new message reflecting the change.
 */

//  RECURSION

/*
    BONUS: Take a look at the Fibonacci sequence. Write a
    recursive method that accepts an int argument representing the number
    or results printed out following the Fibonacci sequence.

    For example:

    fibonacci(5) would print -> 0 1 1 2 3
    fibonacci(10) would print -> 0 1 1 2 3 5 8 13 21 34
 */

// HINT: The recursive method should return an int for each number in the series

// HINT: you may need an additional method using a for loop to actually print
// each number
}