package tree;

public class MaxDepth {
    TreeNode root;

    public MaxDepth() {
        root = null;
    }

    public static int maxDepth(TreeNode root) {
        if (root==null) return 0;
        return 1+Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static int minDepth(TreeNode root) {
        if (root==null) return 0;
        if (root!=null){
            System.out.println(root.val);
            System.out.println(root.val);
        }
        int l = minDepth(root.left);
        int r = minDepth(root.right);
        if (l==0 && r==0) return 0;
        else if (l==0) return r+1;
        else return l+1;
    }

    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int lhight = maxDepth(root.left);
        int rhight = maxDepth(root.right);
        return Math.abs(lhight - rhight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String[] args) {
        MaxDepth rootNode = new MaxDepth();
        rootNode.root = new TreeNode(3);
        rootNode.root.left = new TreeNode(9);
        rootNode.root.right = new TreeNode(20);
        rootNode.root.right.left = new TreeNode(15);
        rootNode.root.right.right = new TreeNode(7);
        System.out.println(minDepth(rootNode.root));
        //System.out.println(maxDepth(rootNode.root));
        //System.out.println(isBalanced(rootNode.root));
    }
}
