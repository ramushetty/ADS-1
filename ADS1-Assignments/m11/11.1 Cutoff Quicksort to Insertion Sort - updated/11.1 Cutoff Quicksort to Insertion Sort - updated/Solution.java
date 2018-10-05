import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * empty constructor.
     */
    private Solution() {
        //empty.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        Quicksort qu = new Quicksort();
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i < n; i++) {
            int cutoff = Integer.parseInt(s.nextLine());
            String[] tokens = s.nextLine().split(" ");
            if (tokens[0].equals("")) {
                System.out.println("[]");
            } else {
            qu.sort(tokens, cutoff);
        }

        }
    }
}
