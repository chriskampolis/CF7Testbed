package gr.aueb.cf.ch7;

public class IndexOfSubstringApp {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o");                           // 1st omicron
        int positionOfSecondo = cf.indexOf("o", 2);     // after second position
        int lastPositionOfo = cf.lastIndexOf("o");               // last o

        String cf2 = cf.substring(1);   // "oding Factory"
        String slice = cf.substring(1, 3);        // "od" (start index(1:"o") until last index -1 (3-1:"d"))
    }
}
