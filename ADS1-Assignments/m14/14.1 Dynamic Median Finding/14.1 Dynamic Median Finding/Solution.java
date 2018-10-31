import java.util.Scanner;
/**
 * Class for solution.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty constructor.
    }
    /**
     * main function.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = Integer.parseInt(scan.nextLine());
        MinPQ<Float> minpq = new MinPQ<Float>(len);
        MaxPQ<Float> maxpq = new MaxPQ<Float>(len);
        float med = 0.0f;
        for (int i = 0; i < len; i++) {
            float floatvalue = Float.parseFloat(scan.nextLine());
            if (floatvalue > med) {
                minpq.insert(floatvalue);
            } else {
                maxpq.insert(floatvalue);
            }
            if (maxpq.size() - minpq.size() > 1) {
                float float1 = maxpq.delMax();
                minpq.insert(float1);
            }
            if (minpq.size() - maxpq.size() > 1) {
                float float2 = minpq.delMin();
                maxpq.insert(float2);
            }
            if (minpq.size() == maxpq.size()) {
                med = (minpq.min() + maxpq.max()) / 2;
                System.out.println(med);
            }
            if (maxpq.size() > minpq.size()) {
                med = maxpq.max();
                System.out.println(med);
                
            }
            if (minpq.size() > maxpq.size()) {
                med = minpq.min();
                System.out.println(med);

            }
        }
    }
}