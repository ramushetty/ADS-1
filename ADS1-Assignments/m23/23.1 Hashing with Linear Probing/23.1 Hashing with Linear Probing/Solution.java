import java.util.Scanner;
/**
 * solution class.
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
        LinearProbingHashST<String, Integer> hashst;
        int count = Integer.parseInt(scan.nextLine());
        hashst = new LinearProbingHashST<String, Integer>();
        while (count > 0) {
            String[] tokens = scan.nextLine().split(" ");
            switch (tokens[0]) {
            case "put":
                hashst.put(tokens[1], Integer.parseInt(tokens[2]));
                break;
            case "get":
                System.out.println(hashst.get(tokens[1]));
                break;
            case "delete":
                hashst.delete(tokens[1]);
                break;
            case "display":
                try {
                    hashst.display();
                } catch (Exception e) {
                    System.out.println("{}");
                }
                break;
            default:
                break;
            }
            count--;
        }
    }
}