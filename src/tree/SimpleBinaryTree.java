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

    static void inorderTraversal(Node node){
        if (node==null) return;
        inorderTraversal(node.left);
        System.out.print(node.key+"  ");
        inorderTraversal(node.right);
    }

    static void preOrderTraversal(Node node){
        if (node==null) return;
        System.out.print(node.key+"  ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    static void postOrderTraversal(Node node){
        if (node==null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.key+"  ");
    }

    public static boolean isValidBST(Node root) {
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static boolean isBST(Node root, long minValue, long maxValue) {
        if(root == null)
            return true;
        if(root.key <= minValue || root.key >= maxValue)
            return false;

        return isBST(root.left,minValue,root.key) && isBST(root.right,root.key,maxValue);

    }

    public static void main(String[] args) {
        SimpleBinaryTree binaryTree = new SimpleBinaryTree();
        binaryTree.root = new Node(20);
        binaryTree.root.left = new Node(10);
        binaryTree.root.right = new Node(40);
        binaryTree.root.left.right = new Node(15);
        System.out.print("Is 40 presnt in tree : "+isPresent(binaryTree.root, 40));
        System.out.print("\nInOrder travrsal : ");
        inorderTraversal(binaryTree.root);
        System.out.print("\nPreorder travrsal : ");
        preOrderTraversal(binaryTree.root);
        System.out.print("\nPostorder travrsal : ");
        postOrderTraversal(binaryTree.root);
        System.out.print("\nIsValid Binary tree : "+isValidBST(binaryTree.root));

    }
}
