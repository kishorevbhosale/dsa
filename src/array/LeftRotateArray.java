package array;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70};
        int d = 2;
        int n = arr.length;
        System.out.println("Before rotate...");
        System.out.println(Arrays.toString(arr));

        leftRotate(arr, d, n);
        System.out.println("\nAfter rotate...");
        System.out.println(Arrays.toString(arr));
        System.out.println("\n\nBefore rotate...");
        System.out.println(Arrays.toString(arr1));
        leftRotateByOne(arr1, d, n);
        System.out.println("\nAfter rotate...");
        System.out.println(Arrays.toString(arr1));
        System.out.println("\nBefore rotate...");
        System.out.println(Arrays.toString(arr));
        rightRotateByK(arr, d);
        System.out.println("\nAfter rotate...");
        System.out.println(Arrays.toString(arr));

    }

    private static void rightRotateByK(int[] arr, int k) {
        while (k > 0) {
            int i = arr.length - 1;
            int tmp = arr[i];
            while (i > 0) {
                arr[i] = arr[i - 1];
                i--;
            }
            arr[0] = tmp;
            k--;
        }
    }

    public static int[] leftRotate(int[] arr, int d, int n) {
        int[] tmp = new int[d];
        for (int i = 0; i < d; i++) {
            tmp[i] = arr[i];
        }
        for (int i = 0; i < n - 2; i++) {
            arr[i] = arr[i + 2];
        }
        for (int i = n - d, j = 0; i < n; i++) {
            arr[i] = tmp[j];
            j++;
        }
        return arr;
    }

    public static int[] leftRotateByOne(int[] arr, int d, int n) {
        for (int i = 0; i < d; i++) {
            int tmp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = tmp;
        }
        return arr;
    }

}
