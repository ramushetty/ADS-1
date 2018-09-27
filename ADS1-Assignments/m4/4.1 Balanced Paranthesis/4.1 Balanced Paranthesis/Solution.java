import java.util.Scanner;
/**
 * Class for isbalanced.
 */
class Isbalanced {
    /**
     * { isbalanced function}.
     *
     * @param      items  The items
     *
     * @return     { returns true or false }
     */
    public boolean isbalanced(final String items) {
        String all = items;
        char leftpar = '(';
        char rightpar = ')';
        char leftbrac = '{';
        char rightbrac = '}';
        char leftsquarebrac = '[';
        char rightsquarebrac = ']';
        Stack stack = new Stack();
        for (int i = 0; i < all.length(); i++) {
            if (all.charAt(i) == leftpar) {
                stack.push(leftpar);
            }
            if (all.charAt(i) == leftbrac) {
                stack.push(leftbrac);

            }
            if (all.charAt(i) == leftsquarebrac) {
                stack.push(leftsquarebrac);
            }
            if (all.charAt(i) == rightpar) {
                if (stack.isempty()) {
                    return false;
                }
                if (stack.pop() != leftpar) {
                    return false;
                }

            }
            if (all.charAt(i) == rightbrac) {
                if (stack.isempty()) {
                    return false;
                }
                if (stack.pop() != leftbrac) {
                    return false;
                }
            }
            if (all.charAt(i) == rightsquarebrac) {
                if (stack.isempty()) {
                    return false;
                }
                if (stack.pop() != leftsquarebrac) {
                    return false;
                }
            }
        }
        return stack.isempty();

    }
}
/**
 *  Solution class.
 */
public final class Solution {
    /**
     * Constructs the object.
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
        Isbalanced bal = new Isbalanced();
        Scanner scan = new Scanner(System.in);
        String l = scan.nextLine();
        int len = Integer.parseInt(l);
        int k = 0;
        while (k < len) {
            String inp = scan.nextLine();
            if (bal.isbalanced(inp)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            k++;
        }


    }
}
