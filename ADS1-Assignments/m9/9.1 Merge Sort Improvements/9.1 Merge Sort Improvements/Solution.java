import java.util.Scanner;
/**
 * mergesort class.
 */
class Mergesort {
    /**
     * insertion sort.
     */
    private final int x = 7;
    /**
     * Constructs the object.
     * TC O(1).
     */
    Mergesort() {
        //empty  Constructor.
    }
    /**
     * merger.
     * TC O(N).
     * @param      array  The array
     * @param      aux    The auxiliary
     * @param      lo     The lower value
     * @param      mid    The middle value
     * @param      hi     The higher value
     */
    public void mergesort(final Comparable[] array, final Comparable[] aux,
        final int lo, final int mid, final int hi) {
        assert isSorted(array, lo, mid);
        assert isSorted(array, mid + 1, hi);
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                aux[k] = array[j++];
            } else if (j > hi) {
                aux[k] = array[i++];
            } else if (less(array[j], array[i])) {
                aux[k] = array[j++];
            } else {
                aux[k] = array[i++];
            }
        }
        assert isSorted(aux, lo, hi);
    }
    /**
     * sorting.
     * TC O(log(N)).
     * @param      array  The array
     * @param      aux    The auxiliary array
     * @param      lo     The lower value
     * @param      hi     The higher value
     */
    public void sort(final Comparable[] array, final Comparable[] aux,
        final int lo, final int hi) {
        if (hi <= lo + x) {
            insertionSort(aux, lo, hi);
            System.out.println("Insertion sort method invoked...");
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(aux, array, lo, mid);
        sort(aux, array, mid + 1, hi);
        if (!less(array[mid + 1], array[mid])) {
            for (int i = lo; i <= hi; i++) {
                aux[i] = array[i];
            }
            System.out.println(
                "Array is already sorted. So, skipped the call to merge...");
            return;
        }
        mergesort(array, aux, lo, mid, hi);
    }
    /**
     * array order.
     * TC O(N).
     * @param      arr     {array}.
     */
    public void sort(final Comparable[] arr) {
        Comparable[] aux = arr.clone();
        sort(aux, arr, 0, arr.length - 1);
    }
    /**
     * insertionsort.
     *
     * TC O(N^2/2).
     * @param      arr     {array}.
     * @param      lo    The lower value
     * @param      hi    The higher value
     */
    public void insertionSort(final Comparable[] arr,
        final int lo, final int hi) {
        for (int i = lo; i <= hi; i++) {
            for (int j = i; j > lo && less(arr[j], arr[j - 1]); j--) {
                exch(arr, j, j - 1);
            }
        }
    }
    /**
     * for exchanging array elements.
     * TC O(N).
     * @param      arr     {Array}
     * @param      i     {Int i}
     * @param      j     {Int j}
     */
    public void exch(final Comparable[] arr,
        final int i, final int j) {
        Comparable swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
    /**
     * .
     * TC O(1).
     * @param      arr     {Comparable}.
     * @param      arr2     {Comparable}.
     *
     * @return     {true or false}.
     */
    public boolean less(final Comparable arr, final Comparable arr2) {
        return arr.compareTo(arr2) < 0;
    }
    /**
     * sorted array.
     * TC O(1).
     * @param      arr     {array}
     *
     * @return     true or false.
     */
    public boolean isSorted(final Comparable[] arr) {
        return isSorted(arr, 0, arr.length - 1);
    }
    /**
     * checks for array is sorted or not.
     * TC O(N).
     * @param      arr     {array}
     * @param      lo    The lower
     * @param      hi    The higher
     *
     * @return     true or false.
     */
    public boolean isSorted(final Comparable[] arr,
        final int lo, final int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            if (less(arr[i], arr[i - 1])) {
                return false;
            }
        }
        return true;
    }
    /**
     * print array.
     * TC O(N).
     * @param      arr     {array}
     *
     * @return     {str}
     */
    public String show(final Comparable[] arr) {
        String str = "[";
        int i;
        for (i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[i] + "]";
        return str;
    }
}
/**
 * solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
     * TC O(1).
     */
    private Solution() {
        //empty Constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        Mergesort merge = new Mergesort();
        while (scan.hasNext()) {
            String[] tokens = scan.nextLine().split(",");
            merge.sort(tokens);
            System.out.println(merge.show(tokens));
            System.out.println();
        }
    }
}
