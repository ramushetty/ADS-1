import java.util.Scanner;
class Steque {
	LinkedList list;
	Steque() {
		list = new LinkedList();
	}
	public void push(int item) {
		list.insertfirst(item);
		list.tostring();

	}
	public void pop() {
		list.deletefront();
		list.tostring();
	}
	public void enqueue(int item) {
		list.insertlast(item);
		list.tostring();

	}


}

public class Solution {
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
		// Stack stack = new Stack();
		// Queue queue = new Queue();

		int itr = Integer.parseInt(scan.nextLine());
		int i = 0;
		do {
			Steque steque = new Steque();

			while (scan.hasNextLine()) {
				//if 

				String str = scan.nextLine();

				// System.out.println("do while inside");
				if (str.equals("pop")) {
					steque.pop();
				} else {
					String[] tokens = str.split(" ");
					switch(tokens[0]) {
						case "push":
							steque.push(Integer.parseInt(tokens[1]));
							break;
						case "enqueue":
							steque.enqueue(Integer.parseInt(tokens[1]));
							break;
						default:
							// System.out.println();

							break;
					}
				}
				//System.out.println();
				// if (scan.hasNextLine().equals("")) {
				// 	continue;

				// }
			}
			System.out.println();
		i++;


		} while (i < itr); 

	}
}