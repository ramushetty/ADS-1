import java.util.Scanner;
/**
 * Class for merge.
 */
class Merge {
    /**
     * { array 1 }.
     */
    private int[] arr1;
    /**
     * { array 2}.
     */
    private int[] arr2;
    /**
     * { final array nothing merged array }.
     */
    private int[] finalarray;
    /**
     * { total length of final array}.
     */
    private int totallength;
    /**
     * { variable k for iterating final array }.
     */
    private int k = 0;
    /**
     * { variable i for iterating array 1}.
     */
    private int i = 0;
    /**
     * { variable j for iterating array 2 }.
     */
    private int j = 0;
    /**
     * { to merge two arrays we use mergesort method here }.
     *
     * @param      arf   first array
     * @param      ars   second array
     */
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
    public void toString(final int[] array) {
        String s = "";
        for (int p = 0; p < array.length - 1; p++) {
            s += array[p] + ",";
        }
        s = s + array[array.length - 1];
        System.out.println(s);
    }

}
/**
 * Class for solution.
 */
public final class  Solution {
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
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        String leng1 = scan.nextLine();
        String leng2 = scan.nextLine();
        String ast1 = scan.nextLine();
        String ast2 = scan.nextLine();
        int a1 = Integer.parseInt(leng1);
        int a2 = Integer.parseInt(leng2);
        Merge mer = new Merge();
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