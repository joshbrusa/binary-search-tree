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
     * Inserts a new node.
     */
    public void add(int key) {
        root = addRecursive(root, key);
    }

    /**
     * Inserts a node recursively using BST.
     */
    private Node addRecursive(Node root, int key) {
        // if the tree is empty return a new node
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            // if the key is less than the root send the key left
            root.left = addRecursive(root.left, key);
        } else if (key > root.key) {
            // if the key is greater than the root send the key right
            root.right = addRecursive(root.right, key);
        }

        // base case, set the left or right pointer, depending on the last case
        return root;
    }

    /**
     * Gets a node.
     */
    public int get(int key) {
        return this.getRecursive(this.root, key).key;
    }

    /**
     * Gets a node using recursive BST.
     */
    private Node getRecursive(Node root, int key) {
        // if the root is null return it
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            // if the key is less than the root search left
            root.left = getRecursive(root.left, key);
        } else if (key > root.key) {
            // if the key is greater than the root search right
            root.right = getRecursive(root.right, key);
        }

        // base case, when the key = root
        return root;
    }

    /**
     * Deletes a node.
     */
    public void delete(int key) {
        root = deleteRecursive(root, key);
    }

    /**
     * Deletes a node recursively using BST.
     */
    private Node deleteRecursive(Node root, int key) {
        // if root is node return node
        if (root == null) {
            return root;
        }

        if (root.key > key) {
            // if the key is less than the root send the pointer left
            root.left = deleteRecursive(root.left, key);
            return root;
        } else if (root.key < key) {
            // if the key is more than the root send the pointer right
            root.right = deleteRecursive(root.right, key);
            return root;
        }

        // our root is now our key
        if (root.left == null) {
            // if the left is null return the right
            return root.right;
        } else if (root.right == null) {
            // if the right is null return the left
            return root.left;
        } else {
            // otherwise we need to move our node down the tree to a leaf
            Node succParent = root;

            // find successor
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }

            /**
             * Delete successor. Since successor is always left child of its
             * parent we can safely make successor's right right child as left
             * of its parent. If there is no succ, then assign succ.right to
             * succParent.right
             */
            if (succParent != root) {
                succParent.left = succ.right;
            } else {
                succParent.right = succ.right;
            }

            // copy the successor data to the root
            root.key = succ.key;

            // delete successor and return root
            return root;
        }
    }

    public void print() {
        printRecursively(root);
    }

    private void printRecursively(Node node) {
        // if the node is null return
        if (node == null) {
            return;
        }

        // traverse left
        printRecursively(node.left);

        // print node
        System.out.println(node.key + " ");

        // traverse right
        printRecursively(node.right);
    }

}
