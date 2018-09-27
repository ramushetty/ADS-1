import java.util.Scanner;


/**
 * List of .
 */
class Stack {
    Linkedlist list;
    /**
     * Constructs the object.
     */
    Stack() {
        list = new Linkedlist();
    }
    /**
     * push method.
     *
     * @param      element  The element
     */
    public void push(char element) {
        list.insertfront(element);
    }
    /**
     * { pop function }.
     *
     * @return     { returns char  }
     */
    public char pop() {
        return list.deletefront();
    }
    /**
     * { isempty function }.
     *
     * @return     { returns size of the stack }
     */
    public boolean isempty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }


}
/**
 * Class for isbalanced.
 */
class Isbalanced {

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
    Solution() {
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