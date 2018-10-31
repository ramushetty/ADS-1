import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        // empty constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        SeparateChainingHashST<String, Integer> sc;
        sc = new SeparateChainingHashST<String, Integer>();
        String tokens = scan.nextLine();
        String[] sep = scan.nextLine().split(" ");
        for (int i = 0; i < sep.length; i++) {
            if (sc.contains(sep[i])) {
                sc.put(sep[i], sc.get(sep[i]) + 1);
            } else {
                sc.put(sep[i], 1);
            }
        }
        String[] sec = scan.nextLine().split(" ");
        for (int i = 0; i < sec.length; i++) {
            if (sc.contains(sec[i])) {
                if (sc.get(sec[i]) == 0) {
                    System.out.print("No");
                    return;
                } else {
                    sc.put(
                        sec[i], sc.get(sec[i]) - 1);
                }
            } else {
                System.out.print("No");
                return;
            }
        }
        System.out.println("Yes");
        System.out.println("Yes");

    }
}