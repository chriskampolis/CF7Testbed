package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on when raining if it is raining
 * AND car is running (>100) OR is dark
 */
public class LightsOn {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean isRaining = false;
        boolean isRunning = false;
        boolean isDark = false;
        int speed = 0;
        boolean lightsOn = false;
        final int MAX_SPEED = 100;

        System.out.println("Please insert if it is raining");
        isRaining = in.nextBoolean();

        System.out.println("Please insert if it is dark");
        isDark = in.nextBoolean();

        System.out.println("Please insert car speed");
        speed = in.nextInt();

        isRunning = speed > MAX_SPEED;
        lightsOn = isRaining && (isDark || isRunning);

        System.out.println("Lights on: " + lightsOn);



    }
}
