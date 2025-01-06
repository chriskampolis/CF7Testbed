package gr.aueb.cf.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {

    public static void main(String[] args) {

//        try (PrintStream ps = new PrintStream("C:/temp/file7-ps.txt", StandardCharsets.UTF_8)) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("/temp/file7-ps.txt"), true)) {

            printMessage(ps, "Hello Coding Factory!");
            printMessage(System.out, "Hello CF!");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Generic PrintStream method.
     *
     * @param ps            the inputPrintStream
     * @param message       the input message.
     */
    public static void printMessage(PrintStream ps, String message) {
        ps.println(message);
    }
}
