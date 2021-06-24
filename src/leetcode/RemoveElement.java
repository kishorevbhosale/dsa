package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 1, 3, 2, 3}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0, j = nums.length-1; i < j;) {
            if (nums[j]!=val && nums[i] == val) {
                nums[i] = nums[j];
                nums[j]=val;
                i++;
                j--;
            } else if (nums[j]==val){
                j--;
            }
            else {
                i++;
            }
        }
        for (int num:nums){
            if (num!=val){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
