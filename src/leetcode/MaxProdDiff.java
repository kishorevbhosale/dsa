package leetcode;

import java.util.Arrays;

public class MaxProdDiff {
    public static void main(String[] args) {
        System.out.println(maxProd(new int[]{10,10,10,10}));
    }

    private static int maxProd(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1] + " " + arr[arr.length - 2]);
        System.out.println(arr[0] + " " + arr[1]);
        return (arr[arr.length - 1] * arr[arr.length - 2]) - (arr[0] * arr[1]);
    }
}
