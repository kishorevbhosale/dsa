package leetcode;

import java.util.Arrays;

public class SortColorsInComplete {
    public static void main(String[] args) {
        int[] nums = new int[]{2,1,0,0,0,0,2,2,2,1,1,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortColors(int[] nums) {
        // 2,0,1 => 0,1,2
        for (int i = 0,j=nums.length-1; i < j ;) {
            if (nums[i]>nums[j]){
                int tmp=nums[i];
                nums[i]=nums[j];
                nums[j]=tmp;
                i++;
                j--;
            }
            else if(nums[i]<nums[j]){
                i++;
            }
        }
    }
}
