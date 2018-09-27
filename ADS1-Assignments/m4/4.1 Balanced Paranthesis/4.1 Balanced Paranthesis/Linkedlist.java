/**
 * Class for linkedlist.
 */
class Linkedlist {
	int size = 0;
	Node first;
	/**
	 * Constructs the object.
	 */
	Linkedlist() {
		first = null;
	}
	/**
	 * { inserts node with data }.
	 *
	 * @param      c     { data}
	 */
	public void insertfront(char c) {
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
	public  char deletefront() {
		char temp = first.data;
		first = first.next;
		size--;

		return temp;
	}
	/**
	 * { returns size of a stack }.
	 *
	 * @return     { returns size }
	 */
	public int size() {
		return size;
	}
}