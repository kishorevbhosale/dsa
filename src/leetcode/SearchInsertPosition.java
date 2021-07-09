package leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{2, 3, 5, 6}, 0));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 6));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        if (nums[r] == target) return r;
        if (nums[r]<target) return r+1;
        if (nums[l] > target) return 0;
        return searchPos(nums, l, r, target);
    }

    private static int searchPos(int[] nums, int l, int r, int target) {
        if (l < r) {
            int m = (l + r) / 2;
            if (nums[m] == target) return m;
            else if (nums[m] < target) {
                if (nums[m + 1] > target) return m+1;
                else return searchPos(nums, m, r, target);
            } else if (nums[m - 1] < target) return m;
            else return searchPos(nums, l, m, target);
        }
        return -1;
    }
}
