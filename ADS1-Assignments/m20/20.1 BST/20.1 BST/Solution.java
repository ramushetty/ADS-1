import java.util.Scanner;

/**
 * solution class.
 */
public final class Solution {
    /**
     * empty constructor.
     */
    private Solution() {
        //empty.
    }
    /**
     * {main Program}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        BST<Book, Integer> b = new BST<Book, Integer>();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            switch (tokens[0]) {
                case "put":
                    Book books = new Book(tokens[1], tokens[2],
                        Float.parseFloat(tokens[2 + 1]));
                    b.put(books, Integer.parseInt(tokens[2 + 2]));
                break;
                case "get":
                    books = new Book(tokens[1], tokens[2],
                        Float.parseFloat(tokens[2 + 1]));
                    System.out.println(b.get(books));
                break;
                case "max":
                    System.out.println(b.max());
                break;
                case "min":
                    System.out.println(b.min());
                break;
                case "select":
                    System.out.println(b.select(
                        Integer.parseInt(tokens[1])));
                break;
                case "floor":
                    books = new Book(tokens[1], tokens[2],
                        Float.parseFloat(tokens[2 + 1]));
                    System.out.println(b.floor(books));
                break;
                case "ceiling":
                    books = new Book(tokens[1], tokens[2],
                        Float.parseFloat(tokens[2 + 1]));
                    System.out.println(b.ceiling(books));
                break;
                case "delete":
                    books = new Book(tokens[1], tokens[2],
                        Float.parseFloat(tokens[2 + 1]));
                    b.delete(books);
                break;
                case "deleteMin":
                    b.deleteMin();
                break;
                case "deleteMax":
                    b.deleteMax();
                break;
                default:
                break;
            }
        }
    }
}