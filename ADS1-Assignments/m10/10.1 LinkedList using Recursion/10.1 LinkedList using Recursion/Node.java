/**
 * Class for node.
 */
class Node {
	/**
	 * data.
	 */
	int data;
	/**
	 * next node address.
	 */
	Node next;
	/**
	 * Constructs the object.
	 *
	 * @param      data  The data
	 * @param      next  The next
	 */
	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}