package src;

/**
 * Our binary search tree.
 */
public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    /**
     * A new key is always inserted at the leaf by maintaining the property of
     * the binary search tree. We start searching for a key from the root until
     * we hit a leaf node. Once a leaf node is found, the new node is added as a
     * child of the leaf node. First compare to the current node, if its less,
     * move left, if its more, move right. Once we hit a leaf insert depending
     * on the value.
     */
    public void insert(int key) {

    }

    /**
     * 
     */
    private void insertRecursive(Node root, int key) {

    }

    /**
     * 
     */
    public void delete(int key) {
    }

    /**
     * 
     */
    public void get(int key) {
    }

    /**
     * 
     */
    public void update(int key) {
    }
}
