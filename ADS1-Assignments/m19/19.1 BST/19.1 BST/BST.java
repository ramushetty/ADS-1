
class Book implements Comparable<Book> {
    
    private String book;
    
    private String author;
    
    private float price;
    
    Book(final String bookk, final String authorr, final float pricee) {
        this.book = bookk;
        this.author = authorr;
        this.price = pricee;
    }
    
    public String getbook() {
        return this.book;
    }
    public String getauthor() {
        return this.author;
    }
    public float getprice() {
        return this.price;
    }
    public int compareTo(final Book that) {
        return this.getbook().compareTo(that.getbook());
    }
    
    public String toString() {
        return getbook() + ", " + getauthor() + ", " + getprice();
    }
}

class BST<Key extends Comparable<Key>, Value> {
    
    private Node root;
   
    private class Node {
        
        private Key key;
        
        private Value value;
        
        private Node left;
        
        private Node right;
        
        private int size;
        
        Node(final Key key, final Value val1,
            final int s) {
            this.key = key;
            this.value = val1;
            this.left = null;
            this.right = null;
            this.size = s;
        }
    }
    
    BST() {
    }

    public int size() {
        return size(root);
    }
 
    private int size(final Node x) {
        if (x == null) {
            return 0;
        } else {
            return x.size;
        }
    }
   
    public void put(final Key key, final Value val) {
        root = put(root, key, val);
    }
   
    private Node put(final Node x, final Key key, final Value val) {
        if (x == null) {
            return new Node(key, val, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            x.left = put(x.left, key, val);
        } else if (cmp > 0) {
            x.right = put(x.right, key, val);
        } else {
            x.value = val;
        }
        return x;
    }
   
    public Value get(final Key key) {
        return get(root, key);
    }
  
    private Value get(final Node x, final Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return get(x.left, key);
        } else if (cmp > 0) {
            return get(x.right, key);
        } else {
            return x.value;
        }
    }
    
    public Key min() {
        return min(root).key;
    }
  
    private Node min(final Node x) {
        if (x.left == null) {
            return x;
        } else {
            return min(x.left);
        }
    }
   
    public Key max() {
        return max(root).key;
    }
   
    private Node max(final Node x) {
        if (x.right == null) {
            return x;
        } else {
            return max(x.right);
        }
    }
  
    public Key floor(final Key key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
  
    private Node floor(final Node x, final Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            return floor(x.left, key);
        }
        if (cmp == 0) {
            return x;
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    }
   
    public Key ceiling(final Key key) {
        Node x = ceiling(root, key);
        if (x == null) {
            return null;
        } else {
            return x.key;
        }
    }
   
    private Node ceiling(final Node x, final Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            Node t = ceiling(x.left, key);
            if (t != null) {
                return t;
            } else {
                return x;
            }
        }
        return ceiling(x.right, key);
    }
   
    public Key select(final int k) {
        Node x = select(root, k);
        return x.key;
    }
  
    private Node select(final Node x, final int k) {
        if (x == null) {
            return null;
        }
        int t = size(x.left);
        if (t > k) {
            return select(x.left, k);
        } else if (t < k) {
            return select(x.right, k - t - 1);
        } else {
            return x;
        }
    }
}
