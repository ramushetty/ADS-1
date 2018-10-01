import java.util.Scanner;
/**
 * Class for steque.
 */
class Steque {
    LinkedList list;
    Steque() {
        list = new LinkedList();
    }
    /**
     * { push }.
     *
     * @param      item  The item
     */
    public void push(int item) {
        list.insertfirst(item);
        list.tostring();

    }
    /**
     * { pop }.
     */
    public void pop() {
        list.deletefront();
        list.tostring();
    }
    /**
     * { enqueue}.
     *
     * @param      item  The item
     */
    public void enqueue(int item) {
        list.insertlast(item);
        list.tostring();

    }


}
/**
 * Class for solution.
 */
public class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty.
    }
    /**
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(String[] args) {
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