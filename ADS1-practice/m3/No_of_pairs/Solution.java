import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for solution.
 */
class  Solution {
	/**
	 * empty constructor.
	 */
	private Solution() {
		//empty.
	}
	/**
	 * { main function }.
	 *
	 * @param      args  The arguments
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number : ");
		int num = scan.nextInt();
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);
		int count = 0;
		int prev = arr[0];
		int temp = 1;
		for (int i = 1; i < num; i++) {

			if (arr[i] == prev) {
				temp++;

			} else {
				count += (temp * (temp - 1)) / 2;
				prev = arr[i];
				temp = 1 ;

			}
		}
		count +=  (temp * (temp - 1)) / 2;

		System.out.println("number of pairs : " +  count);

	}
}