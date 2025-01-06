package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            choice = scanner.nextInt();

            if (!isChoiceValid(choice)) {
                System.out.println("Error. Choice not valid.");
                continue;
            }

            doOnChoice(choice);
        } while (choice != 5);
    }

    public static void printMenu() {
        System.out.println("Choose one of the following");
        System.out.println("1. Create");
        System.out.println("2. Deletion");
        System.out.println("3. Read");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 5;
    }

    public static void doOnChoice(int choice) {

        switch (choice) {
            case 1:
                System.out.println("Create");
                break;
            case 2:
                System.out.println("Delete");
                break;
            case 3:
                System.out.println("Read");
                break;
            case 4:
                System.out.println("Update");
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Wrong choice");
                break;
        }
    }
}
