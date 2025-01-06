package gr.aueb.cf.exercises;

import java.util.Scanner;

public class StarsExe {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int NumberOfStars = 0;

        System.out.println("Please insert number of stars");
        NumberOfStars = scanner.nextInt();

        System.out.println("Horizontal stars");
        for (int i = 1; i <= NumberOfStars; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.println("Vertical stars");
        for (int i = 1; i <= NumberOfStars; i++) {
            System.out.println("*");
        }

        System.out.println("N x M stars");
        for (int i = 1; i <= NumberOfStars; i++) {
            for (int j = 1; j <= NumberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Ascending stars");
        for (int i = 1; i <= NumberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Descending stars");
        for (int i = NumberOfStars; i >= 1; i--) {
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
