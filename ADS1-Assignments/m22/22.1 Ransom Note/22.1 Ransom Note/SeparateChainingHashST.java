/**
 * separate chaining hash search table class.
 *
 * @param      <Key>    The key
 * @param      <Value>  The value
 */
class SeparateChainingHashST<Key, Value> {
    /**
     * capacity.
     */
    private static final int INIT_CAPACITY = 4;
    /**
     * variable num.
     */
    private int num;
    /**
     * variable pp.
     */
    private int pp;
    /**
     * constructor.
     */
    private SequentialSearchST<Key, Value>[] st;
    /**
     * empty symbol table.
     */
    SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }
    /**
     * Initializes an empty symbol table with {@code pp} chains.
     * @param m1 the initial number of chains
     */
    SeparateChainingHashST(final int m1) {
        this.pp = m1;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[pp];
        for (int i = 0; i < pp; i++) {
            st[i] = new SequentialSearchST<Key, Value>();
        }
    }
    /**
     * resize the hash table to have the given number of chains,
     * rehashing all of the keys.
     *
     * @param      chains  The chains
     */
    private void resize(final int chains) {
        SeparateChainingHashST<Key, Value> temp;
        temp = new SeparateChainingHashST<Key, Value>(chains);
        for (int i = 0; i < pp; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }
        this.pp  = temp.pp;
        this.num  = temp.num;
        this.st = temp.st;
    }
    /**
     * hash value between 0 and pp-1.
     *
     * @param      key   The key
     *
     * @return     {Integer}
     */
    private int hash(final Key key) {
        return (key.hashCode() & 0x7fffffff) % pp;
    }
    /**
     * @return the number of key-value
     * pairs in this symbol table
     */
    public int size() {
        return num;
    }
    /**
     * Returns true if this symbol table is empty.
     *
     * @return {@code true} if this symbol table is empty;
     *         {@code false} otherwise
     */
    public boolean isEmpty() {
        return size() == 0;
    }
    /**
     * Returns true if this symbol table contains the specified key.
     *
     * @param  key the key
     * @return {@code true} if this symbol table contains {@code key};
     *         {@code false} otherwise
     */
    public boolean contains(final Key key) {
        return get(key) != null;
    }
    /**
     * Returns the value associated with the specified key in this symbol table.
     *
     * @param  key the key
     * @return the value associated with {@code key} in the symbol table;
     * {@code null} if no such value
     */
    public Value get(final Key key) {
        int i = hash(key);
        return st[i].get(key);
    }
    /**
     * Inserts the specified key-value pair into the symbol table, overwriting the old
     * value with the new value if the symbol table already contains the specified key.
     * Deletes the specified key (and its associated value) from this symbol table
     * if the specified value is {@code null}.
     *
     * @param  key the key
     * @param  val the value
     */
    public void put(final Key key, final Value val) {
        if (val == null) {
            delete(key);
            return;
        }
        if (num >= 10 * pp) {
            resize(2 * pp);
        }
        int i = hash(key);
        if (!st[i].contains(key)) {
            num++;
        }
        st[i].put(key, val);
    }
    /**
     * Removes the specified key and its associated value from this symbol table
     * (if the key is in this symbol table).
     *
     * @param  key the key
     */
    public void delete(final Key key) {
        int i = hash(key);
        if (st[i].contains(key)) {
            num--;
        }
        st[i].delete(key);
        if (pp > INIT_CAPACITY && num <= 2 * pp) {
            resize(pp / 2);
        }
    }
}