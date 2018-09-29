
/**
 * Class for linkedList.
 */
class LinkedList {
	int size = 0;
	Node first;
	Node last;
	/**
	 * Constructs the object.
	 */
	LinkedList() {
		first = null;
		last = null;
	}
	// /**
	//  * { inserts node with data }.
	//  *
	//  * @param      c     { data}
	//  */
	// public void insertfirst(int c) {
	// 	Node oldnode = first;
	// 	first = new Node();
	// 	first.data = c;
	// 	first.next = oldnode;
	// 	size++;
	// 	if (first.next == null) {
	// 		last = first;
	// 	}
		 

	// }
	/**
	 * { deletes the front node of a linkedList }.
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
		if (first == null) {
			newnode.data = num;
			newnode.next = null;
			first = newnode;
			last = newnode;
		}
		newnode.data =  num;
		newnode.next = null;
		last.next = newnode;
		last = newnode;
		if (first == null && last != null) {
			first = last;
		}  
	
		
        size++ ;    
        
        
		
	}
	public String tostring() {
		
		if (size == 0) 
        {
            // System.out.print("[]");
            return "empty";
        }    
        
        Node ptr = first;
        // System.out.print("[");
        String str = "";
        while (ptr.next != null)
        {
            str += ptr.data;
            ptr = ptr.next;
        }
        str += ptr.data;
        return str;
    

	}
	

}