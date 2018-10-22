class Book {
	private String book;
	private String author;
	private String price;
	Book(String bookk, String authorr, String pricee) {
		this.book = bookk;
		this.author = authorr;
		this.price  = pricee;

	} 
	public String getbook() {
		return book;
	}
	public String getauthor() {
		return author;
	}
	public String getprice() {
		return price;
	}
	public int compareTo(Book that) {
		if (this.getbook().compareTo(that.getbook()) > 0) {
			return 1;
		} else if (this.getbook().compareTo(that.getbook()) < 0) {
			return -1;
		} else {
			return 0;
		}


	}
}
public class BST <Key extends Comparable<Key>, Value> {
	private Node root;
	private class Node {
		private Book key;
		private Value value;
		private Node left, right;
		public Node(Book keyy , Value val) {
		this.key = keyy;
		this.value = val;
		this.left = null;
		this.right = null;
		}
	}
	public BST() {
		root = null;
	}
	public void put(Book key , Value value) {

		root = put(root, key, value);
	}
	private Node put(Node x, Book key, Value value) {
		if (x == null) {
			return new Node(key, value);
		}
		int cmp = key.compareTo(x.key);
		if (cmp < 0) {
			x.left = put(x.left, key, value);
		} else if (cmp > 0) {
			x.right = put(x.right, key, value);
		} else {
			x.value = value;
		}
		return x;

	}
	public Value get(Book key) {
        return get(root, key);
    }
    private Value get(Node x, Book key) {
        if (x == null) {
        	return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
        	return get(x.left, key);
       	}
        else if (cmp > 0) {
        	return get(x.right, key);
        }
        else {
        	return x.value;
        }
    }


}