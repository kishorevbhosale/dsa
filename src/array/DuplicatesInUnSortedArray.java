package array;

import java.util.Arrays;

public class DuplicatesInUnSortedArray {
    public static void main(String[] args) {
        int[] a = {4, 4, 4, 4, 8, 3, 6, 4, 6, 5, 6, 8, 2, 7, 7, 7, 7, 7, 7};
        System.out.println("A = " + Arrays.toString(a));
        System.out.println("\nUsing Brute Force approach : ");
        bruteForceApproach(a);
        int[] b = {4, 4, 4, 4, 8, 3, 6, 4, 6, 5, 6, 8, 2, 7, 7, 7, 7, 7, 7};
        System.out.println("\nUsing BitSet approach : ");
        bitSetApproach(b);
    }

    private static void bitSetApproach(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        int[] h = new int[max + 1];
        Arrays.fill(h, 0);
        for (int i = 0; i < a.length; i++) {
            h[a[i]]++;
        }
        for (int i = 0; i < h.length; i++) {
            if (h[i] > 1)
                System.out.println(i + " appears " + h[i] + " times");
        }
    }

    private static void bruteForceApproach(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int count = 1;
            if (a[i] != -1) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        a[j] = -1;
                    }
                }
                if (count > 1)
                    System.out.println(a[i] + " occurs " + count + " times");
            }
        }
    }
}
