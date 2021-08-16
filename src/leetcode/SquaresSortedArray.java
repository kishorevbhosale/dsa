package leetcode;

import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SquaresSortedArray {
    public static void main(String[] args) {

    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(nums[i]*nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
}
