package array;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int a[] = {3,8,16,20,25};
        int b[] = {4,10,12,22,23};
        System.out.println("A = "+ Arrays.toString(a));
        System.out.println("B = "+ Arrays.toString(b));

        System.out.println("After merged : "+  Arrays.toString(mergeArray(a,b)));
    }

    private static int[] mergeArray(int[] a, int[] b) {
        int m = a.length;
        int n = b.length;
        int i=0, j=0, k=0;
        int[] c = new int[m+n];
        while (i<m && j<n){
            if (a[i]<b[j])
                c[k++]=a[i++];
            else
                c[k++]=b[j++];
        }
        while (i<m){
            c[k++]=a[i++];
        }
        while (j<n){
            c[k++]=b[j++];
        }
        return c;
    }
}
