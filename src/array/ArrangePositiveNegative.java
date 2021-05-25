package array;

import java.util.Arrays;

public class ArrangePositiveNegative {
    public static void main(String[] args) {
        Integer[] arr = {-6, 3, -8, 10, 5, -7, -9, 12, -4, 2};
        System.out.println("before sorted pos, neg array: " + Arrays.toString(arr));
        System.out.println("sorted pos, neg array: " + Arrays.toString(rearrangePosNeg(arr)));
    }

    public static Integer[] rearrangePosNeg(Integer[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            while (arr[i] < 0) {
                i++;
            }
            while (arr[j] >= 0) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return arr;
    }
}
