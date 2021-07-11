package array;

import java.util.Arrays;

public class AppendArray {
    public static void main(String[] args) {
        getConcatenation(new int[]{1,2,1});
    }
    public static void getConcatenation(int[] nums) {
        int[] newArr = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            newArr[i]=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            newArr[i+nums.length]=nums[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
}
