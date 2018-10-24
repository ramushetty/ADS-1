import java.util.Scanner;
/**
 * Taxicab class.
 */
class Taxicab implements Comparable<Taxicab> {
    /**
     * {Sum of cubes}.
     */
    private int sum;
    /**
     * {first num}.
     */
    private int num1;
    /**
     * {second  num}.
     */
    private int num2;
    /**
     *
     * Constructs the object.
     *
     * @param      num11  The number 11
     * @param      num22  The number 22
     */
    Taxicab(final int num11, final int num22) {
        this.num1 = num11;
        this.num2 = num22;
        this.sum = (num1 * num1 * num1) + (num2 * num2 * num2);
    }
    /**
     * returns number1.
     *
     * @return     number1
     */
    public int getnum1() {
        return this.num1;
    }
    /**
     * get number 2.
     *
     * @return    returns number two.
     */
    public int getnum2() {
        return this.num2;
    }
    /**
     * Gets the sum.
     *
     * @return     The sum.
     */
    public int getSum() {
        return this.sum;
    }
    /**
     * comparing .
     *
     * @param      that  The that
     *
     * @return     return int value
     */
    public int compareTo(final Taxicab that) {
        if (this.getSum() > that.getSum()) {
            return 1;
        }
        if (this.getSum() < that.getSum()) {
            return -1;
        }
        return 0;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return Integer.toString(sum);
    }
}
/**
 * Class for solution.
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
     *time complexity O(1)
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int pairs = scan.nextInt();
        final int n = 600;
        MinPQ<Taxicab> min = new MinPQ<Taxicab>();
        for (int i = 0; i <= n; i++) {
            min.insert(new Taxicab(i, i));
        }
        int c = 0;
        int tem = 1;
        while (!min.isEmpty()) {
            Taxicab current = min.delMin();
            if (tem == current.getSum()) {
                c++;
            } else {
                c = 0;
            }
            if (c == pairs - 1) {
                num--;
                if (num == 0) {
                    System.out.println(current.getSum());
                    break;
                }
            }
            tem = current.getSum();
            if (current.getnum2() < n) {
                min.insert(new Taxicab(
                               current.getnum1(), current.getnum2() + 1));
            }
        }
    }
}
