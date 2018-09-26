import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for merge.
 */
class merge {
	private int[] arr1;
	private int[] arr2;
	private int[] finalarray;
	private int totallength;
	private int k = 0;
	private int i = 0;
	private int j = 0;
	public void mergesort(final int[] arf, final int[] ars) {
		this.arr1 = arf;
		this.arr2 = ars;
		totallength = arf.length + ars.length;
		finalarray = new int[totallength];
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				finalarray[k] = arr1[i];
				i++;
				k++;
			} else {
				finalarray[k] = arr2[j];
				j++;
				k++;
			}

		}
		while (i < arr1.length) {
			finalarray[k++] = arr1[i++];
		}
		while (j < arr2.length) {
			finalarray[k++] = arr2[j++];
		}
		toString(finalarray);
	}
	/**
	 * Returns a string representation of the object.
	 *
	 * @param      array  The array
	 */
	public void toString(int[] array) {
		int i = 0;
		String s = "";
		for (i = 0; i < array.length - 1; i++) {
			s += array[i] + ",";
		}
		s = s + array[i];
		System.out.println(s);
	}

}
/**
 * Class for solution.
 */
class  Solution {
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
		String leng1 = scan.nextLine();
		String leng2 = scan.nextLine();
		String ast1 = scan.nextLine();
		String ast2 = scan.nextLine();
		int a1 = Integer.parseInt(leng1);
		int a2 = Integer.parseInt(leng2);
		merge mer = new merge();
		if (a1 != 0 && a2 != 0) {
			String[] arr1 = ast1.split(",");
			int[] array1 = new int[a1];

			for (int i = 0; i < a1; i++) {
				array1[i] = Integer.parseInt(arr1[i]);
			}
			String[] arr2 = ast2.split(",");
			int[] array2 = new int[a2];
			for (int i = 0; i < a2; i++) {
				array2[i] = Integer.parseInt(arr2[i]);
			}
			mer.mergesort(array1, array2);
		} else {
			if (a1 == 0) {
				System.out.println(ast2);
			} else {
				System.out.println(ast1);
			}
		}

	}
}