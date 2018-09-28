import java.util.Scanner;
class Deque {
	Linkedlist list = new Linkedlist();

	public void pushLeft(int item) {
		list.insertfirst(item);
		list.tostring();
	}
	public void pushRight(int item) {
		list.insertlast(item);
		list.tostring();

	}
	public void  size() {
		System.out.println(list.size());
	}
	public void popLeft() {
		list.deletefirst();
		list.tostring();
		

	}
	public void popRight() {
		list.deletelast();
		list.tostring();
		
	}
}
public final class Solution {
	Solution() {
		//empty.
	}
	public static void main(String[] args) {
		Deque de = new Deque();
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int i = 0;
		while(i < num) {
			String[] str = scan.nextLine().split(" ");


			switch(str[0]) {
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