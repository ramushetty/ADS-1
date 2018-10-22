import java.util.Scanner;
/**
 * Solution class.
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
     * time complexity of O(N)
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BST bst = new BST();
        while (scan.hasNextLine()) {
            String[] tokens = scan.nextLine().split(",");
            Book book = new Book(
                tokens[1], tokens[2], tokens[2 + 1]);
            switch (tokens[0]) {
                case"put":
                    bst.put(book, tokens[2 + 2]);
                    break;
                case "get":
                    System.out.println(bst.get(book));
                    break;
                default:
                    break;
            }
        }
    }
}

