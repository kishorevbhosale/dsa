package tree;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class IsTreeSame {
    TreeNode root;

    public IsTreeSame(int val) {
        root = new TreeNode(val);
    }

    public IsTreeSame() {
        root = null;
    }

    public static boolean isTreeEqual(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) return false;
        if (p == null && q == null) return true;
        if (p.val != q.val) return false;
        return isTreeEqual(p.left, q.left) && isTreeEqual(p.right, q.right);
    }

    public static void inOrderTraversal(TreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.print(node.val + " ");
        inOrderTraversal(node.right);
    }

    public static void main(String[] args) {
        IsTreeSame rootNode = new IsTreeSame();
        rootNode.root = new TreeNode(15);
        rootNode.root.left = new TreeNode(5);
        rootNode.root.left.left = new TreeNode(1);
        rootNode.root.left.right = new TreeNode(10);
        rootNode.root.right = new TreeNode(30);
        rootNode.root.right.left = new TreeNode(20);
        inOrderTraversal(rootNode.root);

        IsTreeSame rootNode1 = new IsTreeSame();
        rootNode1.root = new TreeNode(15);
        rootNode1.root.left = new TreeNode(5);
        rootNode1.root.left.left = new TreeNode(1);
        rootNode1.root.left.right = new TreeNode(10);
        rootNode1.root.right = new TreeNode(30);
        rootNode1.root.right.left = new TreeNode(20);
        inOrderTraversal(rootNode1.root);

        System.out.println(isTreeEqual(rootNode.root, rootNode1.root));
    }
}
