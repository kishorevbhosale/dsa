package leetcode;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        System.out.println(moveZeroes(new int[]{1,0,0,0,0,0}));
    }

    public static int[] moveZeroes(int[] nums) {
        if (nums.length==1) return nums;
        int i = 0;
        int pos = i;
        while (i < nums.length) {
            while (i < nums.length && nums[i] == 0)
                i++;
            if (i==nums.length) return nums;
            int tmp = nums[pos];
            nums[pos] = nums[i];
            nums[i] = tmp;
            pos = pos+1;
            i++;
        }
        return nums;

    }
}
