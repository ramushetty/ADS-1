
/**
 * Class for linkedList.
 */
class LinkedList {
  /**
   * head node.
   */
  private Node head;
  /**
   * insert function.
   *
   * @param      index  The index
   * @param      data   The data
   *
   * @return     returns boolean
   */
  public boolean insertAt(final int index, final int data) {
    boolean flag = false;
    try {
      head = insert(head, index, data);
    } catch (Exception ex) {
      System.out.println("Can't insert at this position.");
      flag = true;
    }
    return flag;
  }
  Node insert(Node head, final int index, final int data) {
    if (index == 0) {
      return new Node(data, head);
    }
    head.next = insert(head.next, index - 1, data);
    return head;
  }
  /**
   * reverse function.
   */
  public void reverse() {
    head = reverselist(head);
  }
  Node reverselist(Node head) {
    if (head == null || head.next == null) {
      return head;
    }
    Node rev = reverselist(head.next);
    head.next.next = head;
    head.next = null;
    return rev;
  }
  /**
   * print function.
   *
   * @return     returns linked list
   */
  public String tostring() {
    Node ptr = head;
    String str = "";
    while (ptr.next != null) {
      str += ptr.data + ", ";
      ptr = ptr.next;
    }
    str += ptr.data;
    return str;
  }
}
