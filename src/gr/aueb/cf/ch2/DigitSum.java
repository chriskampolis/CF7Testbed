package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Να λαμβάνει ως input από τον χρήστη ένα διψήφιο
 * ακέραιο και υπολογίζει και να εκτυπώνει το άθροισμα των
 * ψηφίων του. Για παράδειγμα, αν ο χρήστης δώσει τον ακέραιο 15,
 * θα πρέπει το αποτέλεσμα να είναι 1 + 5 = 6.
 */
public class DigitSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit = 0;
        int rightDigit = 0;
        int inputNum;
        int sum = 0;

        System.out.println("Please insert a two-digit integer");
        inputNum = in.nextInt();

        leftDigit = inputNum / 10; // With div 10 we get the left digit
        rightDigit = inputNum % 10; // With mod 10 we get the right digit
        sum = leftDigit + rightDigit;

        System.out.printf("Input num: %d, Left digit; %d, Right digit: %d, Sum: %d",
                inputNum, leftDigit, rightDigit, sum);
    }
}
