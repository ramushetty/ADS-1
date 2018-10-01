import java.util.Scanner;
/**
 * Class for steque.
 */
class Steque {
    /**
     * { linked list}.
     */
    private LinkedList list;
    /**
     * Constructs the object.
     */
    Steque() {
        list = new LinkedList();
    }
    /**
     * { push }.
     * time complexity O(1)
     *
     * @param      item  The item
     */
    public void push(final int item) {
        list.insertfirst(item);
        list.tostring();

    }
    /**
     * { pop }.
     * time complexity O(1)
     */
    public void pop() {
        list.deletefront();
        list.tostring();
    }
    /**
     * { enqueue}.
     *
     * @param      item  The item
     * time complexity is O(1)
     */
    public void enqueue(final int item) {
        list.insertlast(item);
        list.tostring();

    }


}
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty.
    }
    /**
     * { main function }.
     *
     * @param      args  The arguments
     * time complexity is O(N^2)
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int itr = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < itr; i++) {
            Steque steque = new Steque();

            while (scan.hasNextLine()) {
                String str = scan.nextLine();

                if (str.length() == 0) {
                    System.out.println();
                    break;
                }
                if (str.equals("pop")) {
                    steque.pop();
                } else {
                    String[] tokens = str.split(" ");
                    switch (tokens[0]) {
                    case "push":
                        steque.push(Integer.parseInt(tokens[1]));
                        break;
                    case "enqueue":
                        steque.enqueue(Integer.parseInt(tokens[1]));
                        break;
                    default:
                        break;
                    }
                }

            }

        }

    }
}
