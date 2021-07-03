package tree;

class Node {
    int key;
    Node left, right;

    public Node(int data) {
        key = data;
        left = right = null;
    }
}

public class SimpleBinaryTree {
    Node root;

    SimpleBinaryTree(int key) {
        root = new Node(key);
    }

    SimpleBinaryTree() {
        root = null;
    }

    static boolean isPresent(Node node, int data) {
        if (node == null) return false;
        else if (node.key == data) return true;
        else if (node.key < data) return isPresent(node.right, data);
        else return isPresent(node.left, data);
    }

    public static void main(String[] args) {
        SimpleBinaryTree binaryTree = new SimpleBinaryTree();
        binaryTree.root = new Node(20);
        binaryTree.root.left = new Node(10);
        binaryTree.root.right = new Node(40);
        System.out.println(isPresent(binaryTree.root, 40));
    }
}
