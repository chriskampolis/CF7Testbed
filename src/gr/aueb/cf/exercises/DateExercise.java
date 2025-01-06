package gr.aueb.cf.exercises;

import java.util.Scanner;

public class DateExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;
        int formattedYear = 0;

        System.out.println("Please enter three integers for day, month, year:");
        day = scanner.nextInt();
        month = scanner.nextInt();
        year = scanner.nextInt();
        formattedYear = year % 100;

        System.out.printf("%02d/%02d/%d\n", day, month, formattedYear);

    }
}