package array;

import java.util.Arrays;

public class RearrangePositiveNegativeAlternate {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int pos, neg = 0;
        pos = partition(arr);
        System.out.println(Arrays.toString(arr));
        while (pos < arr.length && neg < pos && arr[neg] < 0) {
            swap(arr, neg, pos);
            pos++;
            neg += 2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int partition(int[] arr) {
        int h = arr.length;
        int mid = 0;
        int l = 0;
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] < mid) {
                i = i + 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h - 1);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
