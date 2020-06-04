import java.util.Scanner;
//import java.lang.*;

//public class ControlFlowExercises {
//    public static void main(String[] args) {


//=========================Loop Basics============================//

// While Loop

//        int i = 5;
//
//        while (i < 15) {
//            System.out.print(i);
//            i++;
//        }
//For Loop
//        System.out.println("/n");
//        for (int i = 5; i <= 15; i++) {
//        System.out.print(i + " ");
//        }
////Do While
//        int j = 0;
//        do {
//            System.out.println(j);
//            j = j + 2;
//        }
//        while ( j <= 100);
//Do While (backward by 5's)
//        int b = 100;
//        do {
//            //before i print it out - five behind
//            System.out.println(b);
//            b = b - 5; //normal way
//        }
//        while ( b >= -10);
//Do While (squared)
//        long x = 2; // long takes more space --can hurt more performance
//        do {
//            System.out.println(x);
//            x = x * x;
//        }
//        while ( x < 1000000);
//
//=============for(initialization; condition; incrementation/decrementation)==============//
// For Loop (2s)
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.print(i+"\n");
//        }
// For Loop (5s)
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.print(i+"\n");
//        }
// For Loop (100000)
//        for (long i = 2; i <= 1000000; i*=i) {
//            System.out.print(i+"\n");
//        }

//Fizz buzz
        /* Write a program that prints the numbers from 1 to 100.

        *For multiples of three (3): print “Fizz” instead of the number.
        *For the multiples of five (5): print “Buzz”.

        *For numbers which are multiples of both three and five: print “FizzBuzz”.
        */

//        for (int a = 1; a <= 100; a++) {
//            if (a % 3 == 0 && a % 5 == 0) {
//                System.out.printf("%d: fizzbuzz\n", a);
//            } else if (a % 5 == 0) {
//                System.out.printf("%d: buzz\n", a);
//            } else if (a % 3 == 0) {
//                System.out.printf("%d: fizz\n", a);
//            } else {
//                System.out.print(a+"\n");
//            }
//        }
//========Sophie's answer
//        for (int f = 1; f <= 100; f++) {
//            if (f % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (f % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (f % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(f);
//            }
//    }

//====3 Display a table of powers
        /*Prompt the user to enter an integer.
                Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to. ???
        */
//        What number would you like to go up to? 5
//
//        Here is your table!
//
//        number | squared | cubed
//        ------ | ------- | -----
//        1      | 1       | 1
//        2      | 4       | 8
//        3      | 9       | 27
//        4      | 16      | 64
//        5      | 25      | 125

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What number would you like to go up to?");
//        int userInput = userInput.nextInt();
//        System.out.println(" %-6s | %-7s | %-5s\n","number","squared","cubed");
//        System.out.println(" ------ | ------- | -----");
//            for(int i = 1; i <= userInput; i++) {
//            System.out.printf(" %-6d | %-7d | %-5d\n",i, i*i, (int)Math.pow(i, 3));
//            }

//=====4 Convert given number grades into letter grades.
//
//    Prompt the user for a numerical grade from 0 to 100.
//    Display the corresponding letter grade.
//    Prompt the user to continue.
//    Assume that the user will enter valid integers for the grades.
//    The application should only continue if the user agrees to.
//    Grade Ranges:
//
//    A : 100 - 88
//    B : 87 - 80
//    C : 79 - 67
//    D : 66 - 60
//    F : 59 - 0
//
//    Scanner sc = new Scanner(System.in);
//            System.out.println("Would you like to take a look at your letter grades?");
//            String answer = userInput.next();
//
//            while(answer.equalsIgnoreCase("YES")){
//            System.out.println("Please enter the numeric grade:");
//            int grade = userInput.nextInt();
//
//            char letterGrade;
//            if (grade >= 88) {
//                letterGrade = 'A';
//            } else if (grade >= 80) {
//                letterGrade = 'B';
//            } else if (grade >= 67) {
//                letterGrade = 'C';
//            } else if ( grade >= 60) {
//                letterGrade = 'D';
//            } else {
//                letterGrade = 'F';
//            }
//        System.out.printf("Your letter grade is %c.%n", letterGrade);
//    }

//            System.out.printf("A:%d\n", "B:%d\n","C:%d\n", "D:%d\n", "E:%d\n", "F:%d\n", a,b,c,d,f);




//    }
//}
