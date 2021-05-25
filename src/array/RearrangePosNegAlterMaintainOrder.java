package array;

import java.util.Arrays;

public class RearrangePosNegAlterMaintainOrder {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};

        System.out.println("Given array : " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0 && arr[i] > 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < 0) {
                        process(arr, j, i);
                        break;
                    }
                }
            } else if (i % 2 == 1 && arr[i] < 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] > 0) {
                        process(arr, j, i);
                        break;
                    }
                }
            }
        }
        System.out.println("Output array : " + Arrays.toString(arr));
    }

    public static void process(int[] arr, int j, int i) {
        int key = arr[j];
        for (int k = j - 1; k >= i; k--) {
            arr[k + 1] = arr[k];
        }
        arr[i] = key;
    }
}
