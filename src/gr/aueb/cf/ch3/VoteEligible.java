package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Vote eligibility, age > 18.
 * Checks if an age has the right
 * to vote.
 */
public class VoteEligible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int VOTING_AGE = 18;
        int age = 0;
        boolean isEligible = false;

        System.out.println("Please insert an age");
        age = scanner.nextInt();

        // isEligible
        isEligible = age >= VOTING_AGE;

        System.out.printf("%d is eligible: %b ", age, isEligible);
    }
}
