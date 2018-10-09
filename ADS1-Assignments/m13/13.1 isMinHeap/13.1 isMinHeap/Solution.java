import java.util.Scanner;
import java.util.Arrays;
class minpq<P extends Comparable<P>> {
	public void check(P[] arr) {
		int k = 1;
		for (int i = 1; i < arr.length / 2; i++) {
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
					String[] st = new String[tokens.length + 1];
					int k =1;
					for (int j = 0; j < tokens.length; j++) {
						st[k++] = tokens[j];
					}
					// System.out.println(Arrays.toString(st));
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