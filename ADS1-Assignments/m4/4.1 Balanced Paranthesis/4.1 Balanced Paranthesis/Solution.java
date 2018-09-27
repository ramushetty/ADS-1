import java.util.Scanner;
class Node {
	char data;
	Node next;
	Node() {
		// data = 'null';
		next = null;
	}
	Node(char c) {
		data = c;
		next = null;
	}
}
class Linkedlist {
	int size = 0;
	Node first;
	Linkedlist() {
		first = null;
	}
	public void insertfront(char c) {
		Node newnode = new Node();
		newnode.data = c;
		newnode.next = first;
		first = newnode;
		size++;
	}
	public  char deletefront() {
		char temp = first.data;
		first = first.next;
		size--;

		return temp;
	}
	public int size() {
		return size;
	}
}
class Stack {
	Linkedlist list;
	Stack() {
		list = new Linkedlist();
	}
	public void push(char element) {
		list.insertfront(element);
	}
	public char pop() {
		return list.deletefront();
	}
	public boolean isempty() {
		if (list.size() == 0) {
			return true; 
		}
		return false;
	}


}
class Isbalanced {

	public void isbalanced(String items) {
		String all = items;
		char leftpar = '(';
		char rightpar = ')';
		char leftbrac = '{';
		char rightbrac = '}';
		char leftsquarebrac = '[';
		char rightsquarebrac = ']';
		Stack stack = new Stack();
		for (int i = 0; i < all.length(); i++) {
			if (all.charAt(i) == leftpar) {
				stack.push(leftpar);
			}
			if (all.charAt(i) == leftbrac) {
				stack.push(leftbrac);

			}
			if (all.charAt(i) == leftsquarebrac) {
				stack.push(leftsquarebrac);	
			}
			if (all.charAt(i) == rightpar) {
				if (stack.isempty()) {
					System.out.println("NO");
					break;
				}
				if (stack.pop() != leftpar) {
					System.out.println("NO");
					break;
				} 
			}
			if (all.charAt(i) == rightbrac) {
				if (stack.isempty()) {
					System.out.println("NO");
					break;
				}
				if (stack.pop() != leftbrac) {
					System.out.println("NO");
					break;
				} 
			}
			if (all.charAt(i) == rightsquarebrac) {
				if (stack.isempty()) {
					System.out.println("NO");
					break;
				}
				if (stack.pop() != leftsquarebrac) {
					System.out.println("NO");
					break;
				} 
			}
		}
		if (stack.isempty()) {
			System.out.println("YES");

		} else {
			System.out.println("NO");
		}

	}
}
public final class Solution {
	Solution() {
		//empty.
	}
	public static void main(String[] args) {
		Isbalanced bal = new Isbalanced();
		Scanner scan = new Scanner(System.in);
		String l = scan.nextLine();
		int len = Integer.parseInt(l);
		int k = 0;
		while (k < len) {
			String inp = scan.nextLine();
			// String[] tokens = inp.split("null");
			bal.isbalanced(inp);
			k++;
		}
		
		
	}
}