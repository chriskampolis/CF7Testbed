package gr.aueb.cf.ch2;

/**
 * Small frog wants to cross the road.
 * Is on X and wants to reach Y
 * Jumps are D
 * How many hops does it need to make to reach Y.
 *
 * For example:
 *
 * X = 10
 * Y = 85
 * D = 30
 */
public class FrogJumps {

    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int hop = 30;
        int jumps = 0;

        // Calculate jumps
        jumps = (int) Math.ceil((target - start ) / (double) hop);

        System.out.println("Jumps: " + jumps);
    }
}
