package demo;

import java.util.Scanner;

import static demo.Calculator.isAllowed;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the time of arrival");
        double timeOfArrival = scanner.nextDouble();
        isAllowed(timeOfArrival);
        }
}
