package array;

import java.util.Arrays;
import java.util.HashSet;

public class RearrangeArray {
    public static void main(String[] args) {
        int arr[] = {19, 7, 0, 3, 18, 15, 12, 6, 1, 8,
                11, 10, 9, 5, 13, 16, 2, 14, 17, 4};
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (hashSet.contains(i)){
                arr[i]=i;
            }else {
                arr[i]=-1;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
