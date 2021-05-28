package array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 9, 11, 14};
        System.out.println("Array : " + Arrays.toString(arr));
        int k = 2;
        int index = bsearch(arr, k);
        System.out.println("Is 5 present :" + (index != -1));
        System.out.println("present at index : " + index);
        System.out.println("\nrecursive binary search ");
        index = rBsearch(arr, k);
        System.out.println("Is 5 present :" + (index != -1));
        System.out.println("present at index : " + index);


    }

    private static int rBsearch(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        return rBsearch(arr, l, h, k);
    }

    private static int rBsearch(int[] arr, int l, int h, int k) {
        if (l <= h) {
            int m = (l + h) / 2;
            if (arr[m] == k)
                return m;
            else if (arr[m] > k)
                return rBsearch(arr, l, m - 1, k);
            else
                return rBsearch(arr, m + 1, h, k);
        }
        return -1;
    }

    private static int bsearch(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int m = (h + l) / 2;
            if (arr[m] == k)
                return m;
            else if (arr[m] > k)
                h = m - 1;
            else
                l = m + 1;
        }
        return -1;
    }
}
