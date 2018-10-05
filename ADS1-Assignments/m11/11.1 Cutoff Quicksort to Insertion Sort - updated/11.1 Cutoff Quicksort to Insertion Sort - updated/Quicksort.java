import java.util.Collections;
class Quicksort {
    /**
     * insert function .
     *
     * @param      arr   The arr
     * @param      low   The low
     * @param      high  The high
     * time complexity O(N^2)
     */
	public void insert(Comparable[] arr, int low, int high) {
		for (int i = low; i <= high; i++) {
    		for (int k = i; k > low && less(arr[k], arr[k - 1]); k--) {
             	exc(arr, k, k-1);
    		}
		}
	}
    /**
     * exc function.
     *
     * @param      arr   The arr
     * @param      k     { parameter_description }
     * @param      min   The minimum
     * time complexity O(1)
     */
	public void exc(Comparable[] arr, int k, int min) {
		Comparable temp = arr[k];
	    arr[k] = arr[min];
	    arr[min] = temp;
	}
    public void sort(Comparable[] array, int cutOff) {
        sort(array, 0, array.length - 1, cutOff);
        System.out.println(toString(array));
    }
    
	public void sort(Comparable[] arr, int low, int high, int cutOff)
    {
        if (high <= low + cutOff - 1) {
        	insert(arr, low, high);
        	System.out.println("insertionSort called");
        	return;
        }
        int k = partition(arr, low, high);
        System.out.println(toString(arr));
        sort(arr, low, k - 1, cutOff);
        sort(arr, k + 1, high, cutOff);
    }
    /**
     * less function.
     *
     * @param      a     { a }
     * @param      b     { b }
     *
     * @return     { true or false}
     * time complexity O(1)
     */
    public boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }
    public int partition(Comparable[] arr, int low, int high) {
        int i = low;
        int k = high + 1;
        while (true) {
            while (less(arr[++i], arr[low])) {
                if (i == high) {
                    break;
                }
            }
            while (less(arr[low], arr[--k])) {
                if (k == low) {
                    break;
                }
            }
            if (i >= k) {
                break;
            }
            exc(arr, i, k);
        }
        exc(arr, low, k);
        return k;
    }
    
    /**
     * Returns a string representation of the object.
     *
     * @param      arr   The arr
     *
     * @return     String representation of the object.
     */
    public String toString(Comparable[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        str += arr[arr.length - 1] + "]";
        return str;
    }
}