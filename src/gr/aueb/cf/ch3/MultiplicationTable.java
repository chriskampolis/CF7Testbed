package gr.aueb.cf.ch3;

/**
 * Output the multiplication of an integer
 * given by the user (1-10).
 */
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;

        System.out.println("Enter an integer ");
        inputNum = scanner.nextInt();

        while (i <= 10) {
            System.out.println(inputNum + " * " + i + " = " + (inputNum * i));
            System.out.printf("%d * %2d = %2d\n", inputNum, i, inputNum*i);
            i++;
        }
    }
}
