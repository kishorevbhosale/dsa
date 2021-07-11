package tree;

public class SortedArrayToBinaryTree {

    public static TreeNode sortedArrayToBST(int[] nums) {
        return getArrayToBst(nums,0,nums.length-1);
    }

    public static TreeNode getArrayToBst(int[] nums,int start,int end){
        if(start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getArrayToBst(nums,start,mid-1);
        root.right = getArrayToBst(nums,mid+1,end);
        return root;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        sortedArrayToBST(nums);
    }
}
