package leetcode;

public class RunningSum1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 7, 9};

        for (int num : runningSum(nums)) {
            System.out.print(num + " ");
        }
    }

    private static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}
