package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with VAT (24%).
 */
public class PriceWithVat {

    public static void main(String[] args) {
        final double VAT_RATE = 0.24;
        double inputPrice = 0.0;
        double priceWithVAT = 0.0;
        double vat = 0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert price");
        inputPrice = in.nextDouble();
        vat = inputPrice * VAT_RATE;
        priceWithVAT = inputPrice + vat;

        System.out.printf("Price: %.2f, Vat: %.2f, Price with vat: %.2f", inputPrice, vat, priceWithVAT);

    }
}
