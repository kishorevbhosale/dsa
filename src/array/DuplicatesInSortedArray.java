package array;

import java.util.Arrays;

public class DuplicatesInSortedArray {
    public static void main(String[] args) {
        int[] a = {3, 6, 8, 8, 10, 12, 15, 15, 15, 20, 20, 20, 20, 20};
        System.out.println("A = " + Arrays.toString(a));
        findDuplicate(a);
        System.out.println("\n\nDuplicate numbers with occurrences:");
        findDuplicateWithCount(a);
        System.out.println("\n\nDuplicate numbers with bitset:");
        findDuplicateWithBitSet(a);
    }

    private static void findDuplicateWithBitSet(int[] a) {
        int max = 0;
        for (int value : a) {
            if (max < value)
                max = value;
        }
        int[] h = new int[max + 1];
        Arrays.fill(h, 0);
        for (int i = 0; i < a.length; i++) {
            h[a[i]]++;
        }
        for (int i = 0; i < h.length; i++) {
            if (h[i] > 1)
                System.out.println(i + " occurs " + (h[i]) + " times");
        }
    }

    private static void findDuplicateWithCount(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] == a[i + 1]) {
                int j = i + 1;
                while ((j <= a.length - 1) && a[j] == a[i]) {
                    j++;
                }
                System.out.println(a[i] + " occurs " + (j - i) + " times");
                i = j - 1;
            }
        }
    }

    private static void findDuplicate(int[] a) {
        int lastdup = 0;
        System.out.print("Duplicate numbers = ");
        for (int i = 0; i < a.length; i++) {
            if ((i + 1) < a.length && a[i + 1] == a[i] && lastdup != a[i]) {
                System.out.print(a[i] + ",");
                lastdup = a[i];
            }
        }
    }
}
