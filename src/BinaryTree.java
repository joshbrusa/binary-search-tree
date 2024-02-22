package src;

/**
 * Our binary tree.
 */
public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insertRecursive() {

    }

    /**
     * 
     */
    public void insert(int key) {
        if (root == null) {
            root = new Node(key);
            return;
        }

        Node current = root;

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.val) {
            root.right = insert(root.right, key);
        }
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
