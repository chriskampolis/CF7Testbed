package gr.aueb.cf.exercises;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        double celsius = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert temperature in C");

        celsius = scanner.nextDouble();
        System.out.println(celsius + celsiusToFahrenheit(celsius));


    }

    public static double celsiusToFahrenheit(double temp) {

        return (temp * 9.0/5.0) + 32.0;
    }
}
