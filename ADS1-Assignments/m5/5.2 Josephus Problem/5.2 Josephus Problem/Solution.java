import java.util.Scanner;
/**
 * Class for josephus.
 */
class Josephus {
    /**
     * {linked list }.
     */
    private Linkedlist list = new Linkedlist();
    Josephus() {
        list = new Linkedlist();
    }
    /**
     * { for creating nodes }.
     *
     * @param      first  The first
     */
    public void josephus1(final int first) {
        for (int i = 0; i < first; i++) {
            list.insertlast(i);
        }

    }
    /**
     * { josephus2 for iterating }.
     *
     * @param      first   The first
     * @param      second  The second
     */
    public void josephus2(final int first, final int second) {
        Node temp = list.first;
        int count = 1;
        String str = "";
        while (temp != null) {
            if (count == second) {
                // System.out.print(temp.data + " ");
                str += temp.data + " ";
                list.deletefirst();
                temp = temp.next;
                count = 1;
            }
            else {
                list.insertlast(temp.data);
                temp = temp.next;
                list.deletefirst();
                count++;
            }
        }
        String[] tokens = str.split(" ");
        int i = 0;
        for (i = 0; i < tokens.length - 1; i++) {
            System.out.print(tokens[i] + " ");
        }
        System.out.println(tokens[i]);
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
        Josephus de = new Josephus();
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int i = 0;
        while (i < num) {
            String[] str = scan.nextLine().split(" ");
            int first = Integer.parseInt(str[0]);
            int second = Integer.parseInt(str[1]);

            de.josephus1(first);
            de.josephus2(first, second);
            i++;
        }
    }
}
