
/**
 * Class for linkedList.
 */
class LinkedList {
	Node head;
	public boolean insertAt(int index, int data) {
		boolean flag = false;
		try {
			head = insert(head, index, data);
		} catch(Exception ex){
			System.out.println("Can't insert at this position.");
			flag = true;
		}
		return flag;
	}
	Node insert(Node head, int index, int data) {
		if (index == 0) {
			return new Node(data, head);
		}
		head.next = insert(head.next, index - 1, data);
		return head;
	}
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
	public String tostring() {
			Node ptr = head;
	        String str = "";
	        while (ptr.next != null)
	        {
	            str += ptr.data + ", ";
	            ptr = ptr.next;
	        }
	        str += ptr.data;
	        return str;
	}
	

}