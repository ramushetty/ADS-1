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
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Stack stack = new Stack();
		// Queue queue = new Queue();
		Steque steque = new Steque();

		int itr = scan.nextInt();
		int i = 0;
		do {
			String str = scan.nextLine();
			while (i < itr) {

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
							break;
					}
				}
			}
			i++;
			
		} while (i < itr);

	}
}