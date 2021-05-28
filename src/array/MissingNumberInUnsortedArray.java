package array;

import java.util.Arrays;

public class MissingNumberInUnsortedArray {
    public static void main(String[] args) {
        int[] A = {3, 7, 4, 9, 12, 6, 1, 11, 2, 10};
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("Fiding missing in un sorted array using bitset");
        bitsetUnSortedMissing(A);
    }

    private static void bitsetUnSortedMissing(int[] a) {
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        int[] H = new int[max + 1];
        Arrays.fill(H, 0);

        for (int i = 0; i < a.length; i++) {
            H[a[i]]++;
        }
        System.out.println("Missing numbers = ");
        for (int i = 0; i < H.length; i++) {
            if (H[i] == 0)
                System.out.print(i + ",");
        }
    }
}
