
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
	// /**
	//  * { deletes the front node of a linkedList }.
	//  *
	//  * @return     { returns deleted node  }
	//  */
	// public  void deletefirst() {
	// 	if (size == 0) {
	// 		System.out.println("[]");
	// 		return;
	// 	}
	// 	Node temp = first;
	// 	first = first.next;
	// 	temp = null;
	// 	size--;

	// }
	public void insertfront(int c) {
		Node newnode = new Node();
		newnode.data = c;
		newnode.next = first;
		first = newnode;
		size++;
	}
	public  void deletefront() {
		// int temp = first.data;
		try {
			first = first.next;
			size--;
		}  catch(Exception ex) {
            // System.out.println("Steque is empty");

		}

		

		// return temp;
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
			size++;
			return;
		}
		newnode.data =  num;
		newnode.next = null;
		last.next = newnode;
		last = newnode;
		// if (first == null && last != null) {
		// 	first = last;
		// }  
	
		
        size++ ;    
        
		
	}
	public void tostring() {
		if (size == 0) {
            System.out.println("Steque is empty.");
            return;
        } 
		
			
			Node ptr = first;
	        String str = "";
	        while (ptr.next != null)
	        {
	            str += ptr.data + ", ";
	            ptr = ptr.next;
	        }
	        str += ptr.data;
	        System.out.println(str);
		
        
        
    

	}
	

}