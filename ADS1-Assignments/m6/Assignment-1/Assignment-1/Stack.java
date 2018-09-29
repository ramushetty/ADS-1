/**
 * List of .
 */
class Stack {
    LinkedList list;
    /**
     * Constructs the object.
     */
    Stack() {
        list = new LinkedList();
    }
    /**
     * push method.
     *
     * @param      element  The element
     */
    public void push(int  element) {
        list.insertfront(element);
    }
    /**
     * { pop function }.
     *
     * @return     { returns int   }
     */
    public int  pop() {
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