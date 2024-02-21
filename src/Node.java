package src;

/**
 * The node of our tree. It can be any data, but for here we will just use an
 * int.
 */
public class Node {
    Node left;
    Node right;
    int data;

    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }
}
