package leetcode;

import java.util.Arrays;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 4, 9, 56, 90}, 8)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target)
                return new int[]{i + 1, j + 1};
            else if (numbers[i] + numbers[j] < target)
                i++;
            else
                j--;
        }
        return new int[]{};
    }
}
