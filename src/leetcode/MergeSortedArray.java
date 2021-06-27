package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] res = merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3);
        for (int num:res)
            System.out.println(num);
    }

    public static int[] merge(int[] num1, int m, int[] num2, int n) {
        int i = 0, j = 0, k = 0;
        int[] c = new int[num1.length];
        while (i < m && j < n) {
            if (num1[i] < num2[j])
                c[k++] = num1[i++];
            else
                c[k++] = num2[j++];
        }
        while (i < m) {
            c[k++] = num1[i++];
        }
        while (j < n) {
            c[k++] = num2[j++];
        }
        return c;
    }
}
