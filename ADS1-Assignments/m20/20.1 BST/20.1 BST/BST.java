
class Book implements Comparable<Book> {
    
    private String book;
    
    private String author;
    
    private String price;
    
    Book(final String name, final String a, final String p) {
        this.book = name;
        this.author = a;
        this.price = p;
    }
    
    public String getbook() {
        return this.book;
    }
    public String getauthor() {
        return this.author;
    }
    public String getprice() {
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

    public void delete(final Key key) {
        root = delete(root, key);
    }
  
    private Node delete(final Node x, final Key key) {
        Node x1 = x;
        if (x1 == null) {
            return null;
        }
        int cmp = key.compareTo(x1.key);
        if (cmp < 0) {
            x1.left = delete(x1.left, key);
        } else if (cmp > 0) {
            x1.right = delete(x1.right, key);
        } else {
            if (x1.right == null) {
                return x1.left;
            }
            if (x1.left == null) {
                return x1.right;
            }
            Node t = x1;
            x1 = min(t.right);
            x1.right = deleteMin(t.right);
            x1.left = t.left;
        }
        x1.size = size(x.left) + size(x.right) + 1;
        return x1;
    }
 
    public void deleteMin() {
        root = deleteMin(root);
    }

    private Node deleteMin(final Node x) {
        if (x.left == null) {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }

    public void deleteMax() {
        root = deleteMax(root);
    }
    
    private Node deleteMax(final Node x) {
        if (x.right == null) {
            return x.left;
        }
        x.right = deleteMax(x.right);
        x.size = size(x.left) + size(x.right) + 1;
        return x;
    }
}