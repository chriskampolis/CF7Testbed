package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Calculates the sum of two integers
 * with the use of methods.
 */
public class AddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int sum = 0;
        int sub = 0;

        System.out.println("Please insert two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub = AddApp.sub(a, b);

        System.out.println(sum);
        System.out.println(sub);
    }

    /**
     * Adds two integers.
     * @param a the first integer.
     * @param b the second integer.
     * @return  the sum of two integers.
     */

    public static int add(int a, int b) {

//        int result = 0;
//        result = a + b;
//        return result;
        return a + b;
    }

    /**
     * Subtracts two integer
     * @param a the first integer to subtract from.
     * @param b the second integer that is subtracted.
     * @return  the result of the subtraction.
     */

    public static int sub(int a, int b) {
        return a - b;
    }
}
