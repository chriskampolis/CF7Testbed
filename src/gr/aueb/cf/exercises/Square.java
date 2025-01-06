package gr.aueb.cf.exercises;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int b;
        int c = 2;

        System.out.println("Enter an integer: ");
        b = scanner.nextInt();

        double result = square(b, c);

        System.out.println(b + " raised to the power of " + c + " is: " + result);
    }

    public static double square(int b, int c) {
        return Math.pow(b, c);
    }
}