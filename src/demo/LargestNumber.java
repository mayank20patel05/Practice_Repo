package demo;

import java.util.Scanner;

import static demo.Calculator.findLargeValue;

public class LargestNumber {
    public static void main(String[] args) {
        // logic to find the largest number
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three integer numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        findLargeValue(a, b, c);
    }
}
