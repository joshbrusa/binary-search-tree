package src;

/**
 * The node of our tree. Has a key and a pointer to the left and right.
 */
public class Node {
    Node left;
    Node right;
    int key;

    public Node(int key) {
        this.left = null;
        this.right = null;
        this.key = key;
    }
}
