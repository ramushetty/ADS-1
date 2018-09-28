import java.util.Scanner;
/**
 * Class for deque.
 */
class Deque {
    /**
     * { linked list  }.
     */
    private Linkedlist list = new Linkedlist();
    /**
     * Pushes a left.
     *
     * @param      item  The item
     */
    public void pushLeft(final int item) {
        list.insertfirst(item);
        list.tostring();
    }
    /**
     * Pushes a right.
     *
     * @param      item  The item
     */
    public void pushRight(final int item) {
        list.insertlast(item);
        list.tostring();

    }
    /**
     * { size }.
     */
    public void  size() {
        System.out.println(list.size());
    }
    /**
     * { pop left element}.
     */
    public void popLeft() {
        if (list.size() == 0) {
            System.out.println("Deck is empty");
            return;
        }
        list.deletefirst();
        list.tostring();


    }
    /**
     * { pop right element}.
     */
    public void popRight() {
        if (list.size() == 0) {
            System.out.println("Deck is empty");
            return;
        }
        list.deletelast();
        list.tostring();

    }
}
/**
 * { Solution class }.
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
     */
    public static void main(final String[] args) {
        Deque de = new Deque();
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int i = 0;
        while (i < num) {
            String[] str = scan.nextLine().split(" ");


            switch (str[0]) {
            case "pushLeft":
                de.pushLeft(Integer.parseInt(str[1]));
                break;
            case "size":
                de.size();

                break;
            case "pushRight":
                de.pushRight(Integer.parseInt(str[1]));
                break;
            case "popLeft":
                de.popLeft();
                break;
            case "popRight":
                de.popRight();
                break;
            default:
                break;

            }

            i++;

        }
    }
}
