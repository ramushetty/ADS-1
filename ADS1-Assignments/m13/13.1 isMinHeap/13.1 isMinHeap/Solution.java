import java.util.Scanner;
/**
 * Class for minpq.
 *
 * @param      <P>   { generics type }
 */
class minpq<P extends Comparable<P>> {
    /**
     * check function 
     * takes time complexity of O(N)
     *
     * @param      arr   The arr
     */
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
     * with time complexity of O(N^2)
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
                int k = 1;
                for (int j = 0; j < tokens.length; j++) {
                    st[k++] = tokens[j];
                }
                // System.out.println(Arrays.toString(st));
                minpq<String> min = new minpq<String> ();
                min.check(st);

            }
            break;
        case "Integer":
            count = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < count; i++) {
                String[] tokens = scan.nextLine().split(",");
                Integer[] st = new Integer[tokens.length + 1];
                int k = 1;
                for (int j = 0; j < tokens.length; j++) {
                    st[k++] = Integer.parseInt(tokens[j]);
                }
                // System.out.println(Arrays.toString(st));
                minpq<Integer> min = new minpq<Integer> ();
                min.check(st);
            }

            break;
        case "Double":
            count = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < count; i++) {
                String[] tokens = scan.nextLine().split(",");
                Double[] st = new Double[tokens.length + 1];
                int k = 1;
                for (int j = 0; j < tokens.length; j++) {
                    st[k++] = Double.parseDouble(tokens[j]);
                }
                // System.out.println(Arrays.toString(st));
                minpq<Double> min = new minpq<Double> ();
                min.check(st);
            }
            break;
        case "Float":
            count = Integer.parseInt(scan.nextLine());
            for (int i = 0; i < count; i++) {
                String[] tokens = scan.nextLine().split(",");
                if (tokens[0].equals("")) {
                    System.out.println("false");
                } else {
                    Float[] st = new Float[tokens.length + 1];
                    int k = 1;
                    for (int j = 0; j < tokens.length; j++) {
                        st[k++] = Float.parseFloat(tokens[j]);
                    }
                    // System.out.println(Arrays.toString(st));
                    minpq<Float> min = new minpq<Float> ();
                    min.check(st);

                }


            }
            break;
        }
    }
}
// if tokens[0].equals("") {
//  System.out.println("false");
// } else {

// }