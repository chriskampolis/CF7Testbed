package gr.aueb.cf.ch4;

/**
 * Print chars.
 */
public class CharPrintApp {

    public static void main(String[] args) {
        char ch1 = 'A';
        char ch2 = '8';

        System.out.println("char: " + ch1 + " ordinal " + (int) ch1); //typecast
        System.out.println("char: " + ch2 + " ordinal " + (int) ch2); //typecast

        System.out.printf("Char: %c, Ordinal: %d\n", ch1, (int) ch1); //typecast
        System.out.printf("Char: %c, Ordinal: %d\n", ch2, (int) ch2); //typecast
    }
}
