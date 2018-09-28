import java.util.Scanner;
/**
 * Class for josephus.
 */
class Josephus {
	Linkedlist list = new Linkedlist();
	Josephus() {
		list = new Linkedlist();
	}
	public void josephus1(final int first) {
		for (int i = 0; i < first; i++) {
			list.insertlast(i);
		}

	}
	public void josephus2(final int first, final int second) {
		Node temp = list.first;
		int count = 1;
		while (list.size() <= first) {
			if (count == second) {
				System.out.println(temp.data);
				list.deletefirst();
				count = 1;
			}
			else {
				list.insertlast(list.first.data);
				temp = temp.next;
				list.deletefirst();
				count++;
			}

		}
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