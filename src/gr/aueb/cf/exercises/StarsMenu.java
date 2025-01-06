package gr.aueb.cf.exercises;

import java.util.Scanner;

public class StarsMenu {

    public static void main(String[] args) {

        int choice = 0;
        int numberOfStars = 0;
        Scanner in = new Scanner(System.in);

        do {
            printMenu();
            choice = in.nextInt();
            if (choice < 1 || choice > 6) {
                System.out.println("Wrong choice");
               continue;
            }

            if (choice != 6) {
                System.out.println("Give the number of stars");
                numberOfStars = in.nextInt();
            }

            switch (choice) {
                case 1:
                    printStarsH(numberOfStars);
                    System.out.println();
                    break;
                case 2:
                    printStarsV(numberOfStars);
                    System.out.println();
                    break;
                case 3:
                    printStarsNxM(numberOfStars);
                    System.out.println();
                    break;
                case 4:
                    printStarsAsc(numberOfStars);
                    System.out.println();
                    break;
                case 5:
                    printStarsDesc(numberOfStars);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Quitting...");;
                    break;
                default:
                    System.out.println("Error in choice");
                    System.out.println();
                    break;
            }
        } while (choice != 6);
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω:");
        System.out.println("1. Οριζόντια Αστεράκια");
        System.out.println("2. Κάθετα Αστεράκια");
        System.out.println("3. nxm Αστεράκια");
        System.out.println("4. Ascending Αστεράκια");
        System.out.println("5. Descending Αστεράκια");
        System.out.println("6. Έξοδος");
    }

    public static void printStarsH(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }
    public static void printStarsV(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }

    public static void printStarsNxM(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsAsc(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void printStarsDesc(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
