package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(arr));
        ssort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void ssort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min_idx = i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = tmp;
        }
    }
}
