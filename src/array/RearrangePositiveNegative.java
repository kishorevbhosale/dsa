package array;

import java.util.Arrays;

public class RearrangePositiveNegative {
    public static void main(String[] args) {
        int[] arr = {-5, -2, 5, 2, 4, -7, -1, 8, 0, -8};
        System.out.println("Before rearrange : " + Arrays.toString(arr));
        reArrange(arr);
        System.out.println("After rearrange : " + Arrays.toString(arr));
    }

    private static void reArrange(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] < 0)
                i++;
            while (arr[j] > 0)
                j--;
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
