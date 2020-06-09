import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    Scanner sc = new Scanner(System.in);

    public static void addition(int a, int b){
        int sum = a + b;
        System.out.printf("\nThe sum of %d & %d is %d.", a, b, sum);
    }
    public static void subtraction(int a, int b){
        int difference = a - b;
        System.out.printf("\n\nThe difference of %d & %d is %d.", a, b, difference);
    }
    public static void multiplication(int a, int b){
        int product = a * b;
        System.out.printf("\n\nThe product of %d & %d is %d.", a, b, product);
    }
    public static void division(int a, int b){
        int divide = a / b;
        System.out.printf("\n\nIf I divide %d by %d, my answer is %d.", a, b, divide);
    }
    public static void modulus(int a, int b){
        int mod = a % b;
        System.out.printf("\n\nThe remainder of %d / %d is %d.\n", a,b,mod);
    }
// loop multiplication
    public static double loopMultiply(double a, double b) {
        double result = 0;
        for (double i = 0; i <a; i++) {
            result += b;
        }
        return result;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.printf("\nEnter a number between %d and %d: ", min, max);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            System.out.println("Try again! Enter a valid number within the range.");
            return getInteger(min, max);
        }
        System.out.print("Thanks for entering a valid number!");
        return userInput;
    }

//    public static int game(a,b) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Wanna play? Roll the dice homie!");
//
//            int a=(int)(Math.random()*20+1);
//            int b=(int)(Math.random()*20+1);
//            int sum = a + b;
//
//            System.out.print("Roll: total = " + sum);
//
//            if (sum <=19) {
//                System.out.println("Sorry with a " + sum + " You can't attack, hope your shield can handle the damage! :(");
//                break;
//            } else if(sum >= 30) {
//                System.out.println("Woah!!! With a " + sum + " You'll likely demolish your opponent dude!");
//                break;
//            }
//        return game();
//    }







    public static void main(String[] args) {
        //could do a function that runs all of the operator methods
//        addition(1,2);
//        subtraction(5,2);
//        multiplication(10,10);
//        division(100,4);
//        modulus(100,9);
//
        System.out.println("\n"+loopMultiply(2,2));
//        System.out.println("Enter a  number between 1 and 50: ");
        int myInt = getInteger(1,50);

//        game();





        }
}
