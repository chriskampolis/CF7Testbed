package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Changes Days, Hours, Minutes and seconds,
 * into total seconds.
 */
public class DateTimeToSecondsConverter {

    public static void main(String[] args) {

        // Declarations
        final int SEC_PER_DAY = 3600 * 24;
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inputDays = 0;
        int inputHours = 0;
        int inputMinutes = 0;
        int inputSeconds = 0;
        int totalSeconds = 0;


        // Commands
        System.out.println("Please insert days, hours, minutes, seconds");
        inputDays = in.nextInt();
        inputHours = in.nextInt();
        inputMinutes = in.nextInt();
        inputSeconds = in.nextInt();

        totalSeconds = inputDays * SEC_PER_DAY + inputHours * SEC_PER_HOUR + inputMinutes * SEC_PER_MINUTE + inputSeconds;
        System.out.printf(Locale.US,"Total seconds: %,d seconds\n", totalSeconds);
    }
}
