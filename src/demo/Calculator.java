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

        System.out.println("1 + 1 = 2");
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
