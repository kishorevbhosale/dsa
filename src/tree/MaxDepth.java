package tree;

public class MaxDepth {
    TreeNode root;

    public MaxDepth() {
        root = null;
    }

    public static int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return Math.max(1+maxDepth(root.left), 1+maxDepth(root.right));
    }

    public static void main(String[] args) {
        MaxDepth rootNode = new MaxDepth();
        rootNode.root = new TreeNode(1);
        rootNode.root.left = new TreeNode(2);
        rootNode.root.left.left = new TreeNode(3);
        rootNode.root.left.left.left = new TreeNode(4);
        rootNode.root.left.left.left.left = new TreeNode(5);
        System.out.println(maxDepth(rootNode.root));
    }
}
