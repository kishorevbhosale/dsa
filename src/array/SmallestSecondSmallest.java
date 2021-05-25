package array;

import java.util.Arrays;

public class SmallestSecondSmallest {
    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};
        for (int i = 0; i < 2; i++) {
            int min_id = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_id]) {
                    min_id = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[min_id];
            arr[min_id] = tmp;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0] + "," + arr[1]); //complexit O(nk) k=2 // Selection sort for 2 pass only
    }
}
