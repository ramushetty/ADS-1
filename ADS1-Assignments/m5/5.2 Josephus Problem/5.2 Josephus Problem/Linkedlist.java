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
			System.out.println("[]");
			return;
		}
		Node temp = first;
		first = first.next;
		temp = null;
		size--;

	}
	public void deletelast() {
		Node temp = first;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		last = temp;
		
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
	
		
        size++ ;    
        
        
		
	}
	public void tostring() {
		
		if (size == 0) 
        {
            System.out.print("[]");
            return;
        }    
        
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