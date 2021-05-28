package array;

import java.util.Arrays;

public class MissingNumberInSortedArray {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("Smallest missing number = " + smallestMissing(A)); // array must be sorted

        int[] B = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println("\nB = " + Arrays.toString(B));
        System.out.println("Missing number = " + findMissingByFormula(B)); // first n natural numbers and only 1 number is missing

        int[] C = {6, 7, 8, 10, 11, 12, 13};
        System.out.println("\nC = " + Arrays.toString(C));
        System.out.print("Finding single missing number = ");
        findSingleMissing(C); // sorted array and number missing with diff 1 only

        int[] D = {6, 7, 8, 10, 13, 17, 21};
        System.out.println("\nD = " + Arrays.toString(D));
        System.out.print("Finding multiple missing numbers = ");
        findMultipleMissing(D); // sorted array and number missing with diff 1 only

    }

    private static void findMultipleMissing(int[] d) {
        int n = d.length;
        int i = 0;
        int diff = d[i] - i;
        while (i < n) {
            if ((d[i] - i) != diff) {
                while ((diff < (d[i] - i))) {
                    System.out.print((diff + i) + ",");
                    diff++;
                }
            }
            i++;
        }
    }

    private static void findSingleMissing(int[] c) {
        int i = 0;
        int diff = c[i] - i;
        while (i < c.length) {
            if ((c[i] - i) != diff) {
                System.out.println((diff + i));
                break;
            }
            i++;
        }
    }

    private static int findMissingByFormula(int[] b) {
        int n = b.length;
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += b[i];
        }
        return (n * (n + 1) / 2) - total;
    }

    private static int smallestMissing(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] - a[i] != 1)
                return a[i] + 1;
        }
        return -1;
    }
}
