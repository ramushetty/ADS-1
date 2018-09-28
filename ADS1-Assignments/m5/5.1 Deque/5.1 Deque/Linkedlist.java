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
		Node oldnode = first;
		first = new Node();
		first.data = c;
		first.next = oldnode;
		size++;
		if (first.next == null) {
			last = first;
		}
		 

	}
	/**
	 * { deletes the front node of a linkedlist }.
	 *
	 * @return     { returns deleted node  }
	 */
	public  void deletefirst() {
		if (size == 0) {
			System.out.println("empty");
			return;
		}
		first = first.next;
		size--;

	}
	public void deletelast() {
		Node temp = first;
		while(temp.next.next != null) {
			temp = first.next;
		}
		temp.next = null;
		last = temp;
		// Node curr = null;

	 //    for (curr = this.first; curr.next.next != null;curr = curr.next) {

	 //    }

	 //    curr.next = null;
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
	public void insertlast(int num) {
		

		Node newnode = new Node();
		newnode.data =  num;
		newnode.next = null;
		last.next = newnode;
		last = newnode;
		if (first == null && last != null) {
			first = last;
		}  
		// Node temp = last;
		// Node last = new Node();
		// last.data = num;
		// last.next = null;
		// temp.next = last;
		
        size++ ;    
        
        
		
	}
	public void tostring() {
		// Node temp = first;
		// if (size == 1) {
		// 	System.out.print("[" + temp.data + "]");
		// } else {
		// 	while (temp.next != null) {
		// 		System.out.print("[" + temp.data + ", ");
		// 		temp = temp.next;
		// 	}
		// 	System.out.println(temp.data + "]");			
		// }
		if (size == 0) 
        {
            System.out.print("empty");
            return;
        }    
        // if (first.next == null) 
        // {
        //     System.out.println("[" + first.data + "]");
        //     return;
        // }
        Node ptr = first;
        System.out.print("[");

        while (ptr.next != null)
        {
            System.out.print( ptr.data + ", ");
            ptr = ptr.next;
        }
        System.out.println(ptr.data+ "]");
    

	}
	

}