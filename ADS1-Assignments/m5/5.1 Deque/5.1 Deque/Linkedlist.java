/**
 * Class for node.
 */
class Node {
	/**
	 * { data }.
	 */
	int data;
	Node next;
	Node() {
		//empty
	}
	
}
/**
 * Class for linkedlist.
 */
class Linkedlist {
	int size = 0;
	Node first;
	Node last;
	/**
	 * Constructs the object.
	 */
	Linkedlist() {
		first = null;
		last = null;
	}
	/**
	 * { inserts node with data }.
	 *
	 * @param      c     { data}
	 */
	public void insertfirst(int c) {
		Node newnode = new Node();
		newnode.data = c;
		newnode.next = first;
		first = newnode;
		size++;
	}
	/**
	 * { deletes the front node of a linkedlist }.
	 *
	 * @return     { returns deleted node  }
	 */
	public  void deletefirst() {
		first = first.next;
		size--;

	}
	public void deletelast() {
		// Node temp = first;
		// while(temp.next != null) {
		// 	temp = first.next;
		// }
		Node curr = null;

	    for (curr = this.first; curr.next.next != null;curr = curr.next) {

	    }

	    curr.next = null;
	    size--;

	}
	/**
	 * { returns size of a stack }.
	 *
	 * @return     { returns size }
	 */
	public int size() {
		return size;
	}
	public void insertlast(int c) {
		Node newnode = new Node();
		newnode.data = c;
		last.next = first;
		last = newnode;
		size++;
	}
	public void tostring() {
		Node temp = first;
		while (temp.next != null) {
			System.out.println("[" + temp.data + ", ");
			temp = temp.next;
		}
		System.out.println(temp.data + "]");
	}
	

}