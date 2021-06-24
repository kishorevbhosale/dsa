package leetcode;

public class MaxSumArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int[] res = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int j = 0;
        while (j < nums.length && nums[j] <= 0) {
            if (nums[j] > max)
                max = nums[j];
            res[j] = 0;
            j++;
        }
        if (j == 0) {
            max = nums[j];
            res[0] = nums[0];
            j++;
        }
        for (int i = j; i < nums.length; i++) {
            if (nums[i] >= res[i - 1] && res[i - 1] <= 0) {
                res[i] = nums[i];
            } else
                res[i] = res[i - 1] + nums[i];
            if (res[i] > max)
                max = res[i];
        }
        return max;
    }
}
