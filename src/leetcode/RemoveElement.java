package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{}, 3));
    }

    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val)
                nums[i] = -1;
        }

        for (int i = 0, j = nums.length-1; i < j;) {
            if (nums[j]!=-1 && nums[i] == -1) {
                nums[i] = nums[j];
                nums[j]=-1;
                i++;
                j--;
            } else if (nums[j]==-1){
                j--;
            }
            else {
                i++;
            }
        }
        for (int num:nums){
            if (num!=-1){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
