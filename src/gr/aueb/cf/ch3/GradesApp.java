package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * User gives
 * 1. Total grades of classes
 * 2. Number of classes
 * 3. Calculates the average
 *
 * 'Excellent' if average >= 9,
 * 'Very good' if average >= 7,
 * 'Good' if average >= 5,
 * 'Fail' if average < 5.
 */
public class GradesApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalMarks = 0;
        int coursesCount = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        totalMarks = scanner.nextInt();

        if (totalMarks <= 0) {
            System.out.println("Total marks must not be zero.");
            System.exit(1);
        }

        System.out.println("Please insert courses count");
        coursesCount = scanner.nextInt();

        if (coursesCount <= 0) {
            System.out.println("Courses count must not be zero");
            System.exit(1);
        }

        average = totalMarks / coursesCount;

        if (average > 10) {
            System.out.println("Error. The average must be less or equal to 10");
            System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        } else if (average >= 7) {
            System.out.println("Very good");
        } else if (average >= 5) {
            System.out.println("Good");
        } else if (average < 5) {
            System.out.println("Failure");
        }
    }
}