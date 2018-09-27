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