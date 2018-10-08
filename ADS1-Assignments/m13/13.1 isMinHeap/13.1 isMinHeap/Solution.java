import java.util.Scanner;
class minpq<P extends Comparable<P>> {
	public void check(P[] arr) {
		int k = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i].compareTo(arr[2 * i]) > 0 || arr[i].compareTo(arr[2 * i + 1]) > 0 ) {
				System.out.println("false");
				return;
			}

		}
		System.out.println("true");
		
	}
}
/**
 * class solution.
 */
public final class Solution {
	/**
	 * empty constructor.
	 */
	private Solution() {
		//empty.
	}
	/**
	 * main function.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		switch (str) {
			case"String":
				int count = Integer.parseInt(scan.nextLine());

				for (int i = 0; i < count; i++) {
					String[] tokens = scan.nextLine().split(",");
					String[] st = new String[tokens.length];
					for (int j = 1; j < tokens.length + 1; j++) {
						st[i] = tokens[j -1];
					}
					minpq<String> min= new minpq<String> ();
					min.check(st);

				}
				break;
			case "Integer":
				break;
			case "Double":
				break;
			case "Float":
				break;
		}
	}
}