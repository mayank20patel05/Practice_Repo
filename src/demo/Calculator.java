package demo;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.IntStream;

public class Calculator {
    public static void main(String[] args) {

        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of each subject one by one.");

        int totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }
        System.out.println("total marks are: " + totalMarks);
        System.out.println("Average of all marks is: " + (totalMarks/marks.length));




        /*  //for counting and checking the vowels in a given string
        String s = new String("This is just a string which I am writing to find how many vowels ar ether in this string and to count how many?");

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {

                System.out.println("character at " + i + " index is " + s.charAt(i));
                count++;
            }
        }
        System.out.println("total number of vowels in the provide string is: " + count);
        */

//        Scanner scanner = new Scanner(System.in);

//        int sum = 0;
//        System.out.print("fibonacci series: " + 0 + " " + 1 + " ");
//        for (int i = 1; i < 15; i++) {
//            System.out.print(i + " ");
//        }

        /* Fibonacci series Code
        System.out.println("enter the No. of elements required for fibonacci series");
        int n = scanner.nextInt();
        int[] fibonacci = new int[n];



        Array.set(fibonacci, 0 , 0);
        Array.set(fibonacci, 1 , 1);

        for (int i = 0; i < Array.getLength(fibonacci)-2 ; i++ ) {
            fibonacci[i+2] = fibonacci[i] + fibonacci[i+1];
        }
        System.out.println("Fibonacci series first " + n + " elements are: ");
        System.out.println(Arrays.toString(fibonacci)); //or
        Arrays.stream(fibonacci).forEach(System.out::println);
         */

        /* // for triangle
        for (int i = 1; i <= 10 ; i++) {
            for (int k = 10; k >= i ; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/


/*      // for right angle triangle
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*
        //for diamond shape
        int n = 10;
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n-1 ; i >= 1 ; i--) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        // logic to find the largest number
       /* System.out.println("please enter the time of arrival");
        timeOfArrival = scanner.nextDouble();
        isAllowed(timeOfArrival);

        System.out.println("Enter three integer numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        findLargeValue(a, b, c);*/

       /* //logic to print a fibonacci series
        int a=0 , b=1;
        System.out.print(a + ", " + b );
        for (int i = 3; i <= 10 ; i++) {
            int c = a + b;
            System.out.print(", " +c );
            a = b;
            b = c;
        }
        System.out.println();*/

    }

    public static double sum(double a, double b) {
        System.out.println("Summation of " + a + " and " + b + " is:");
        return a + b;
    }

    public static double sub(double a, double b) {
        System.out.println("Subtraction of " + a + " and " + b + " is:");
        return a - b;
    }

    public static double multi(double a, double b) {
        System.out.println("Multiplication of " + a + " and " + b + " is:");
        return a * b;
    }

    public static double div(double a, double b) {
        System.out.println("Division of " + a + " and " + b + " is:");
        return a / b;
    }

    public static void isAllowed(double time) {
        if (time <= 10) {
            System.out.println("You are allowed to enter the class");
        } else {
            System.out.println("You are not allowed to enter the class");
        }
    }

    public static void findLargeValue(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Largest value is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest value is: " + b);
        } else {
            System.out.println("Largest value is: " + c);
        }
    }
}
