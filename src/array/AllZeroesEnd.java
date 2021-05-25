package array;

import java.util.Arrays;

public class AllZeroesEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 9, 8, 4, 0, 0, 2,
                7, 0, 6, 0, 9};
        int pivot = 0;
        int l = 0;
        int h = arr.length - 1;
        int i = l - 1;
        for (int j = l; j <= h; j++) {
            if (arr[j] > pivot) {
                i = i + 1;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, h);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
        return arr;
    }
}
