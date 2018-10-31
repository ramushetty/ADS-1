import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for sum.
 * 
 */
class Sum {
    /**
     * {int array.
     */
    private int[] array;
    /**
     * {num}.
     */
    private int num;
    /**
     * {count}.
     */
    private int count;
    /**
     * Constructs the object.
     *
     * @param      n1  The number 1
     */
    Sum(final int n1) {
        this.count = 0;
        this.num = n1;
        this.array = new int[n1];
    }
    /**
     * {binary search}.
     *
     * @param      a     {array }
     * @param      key   The key
     *
     * @return     {index}
     */
    public int BS(final int[] a, final int key) {
        int first = 0;
        int last = a.length - 1;
        while (first <= last) {
            int mid = first + (last - first) / 2;
            if (key < a[mid]) {
                last = mid - 1;
            } else if (key > a[mid]) {
                first = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    /**
     * sum array.
     *
     * @param      array1  The array1
     *
     * @return     {count }
     */
    public int sarray(final int[] array1) {
        Arrays.sort(array1);
        for (int i = 0; i <= array1.length - 1; i++) {
            for (int j = i + 1; j <= array1.length - 1; j++) {
                int k = BS(array1, -(array1[i] + array1[j]));
                if (k > j) {
                    count++;
                }
            }
        }
        return count;
    }
}
/**
 * {Solution class}.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //Empty constructor .
    }
    /**
     * {main method}.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] t = new int[n];
        Sum s = new Sum(n);
        for (int i = 0; i < n; i++) {
            t[i] = scan.nextInt();
        }
        int count1 = s.sarray(t);
        System.out.println(count1);
    }
} 