package array;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Array : " + Arrays.toString(arr));
        int k = 301;
        System.out.println("Is 301 present in given array: " + lsearch(arr, k));
        k = 30;
        System.out.println("Is 30 present in given array: " + lsearch(arr, k));
    }

    private static boolean lsearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k)
                return true;
        }
        return false;
    }
}
