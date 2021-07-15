package tree;

public class TreeTargetSum {
    TreeNode root;

    public static void main(String[] args) {
        TreeTargetSum sumTree = new TreeTargetSum();
        sumTree.root = new TreeNode(5);
        sumTree.root.left = new TreeNode(4);
        sumTree.root.right = new TreeNode(8);
        sumTree.root.left.left = new TreeNode(11);
        sumTree.root.right.left = new TreeNode(13);
        sumTree.root.right.right = new TreeNode(4);
        sumTree.root.left.left.left = new TreeNode(7);
        sumTree.root.left.left.right = new TreeNode(2);
        sumTree.root.right.right.right = new TreeNode(1);
        System.out.println(hasPathSum(sumTree.root, 5));
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if (root.val == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }


}
