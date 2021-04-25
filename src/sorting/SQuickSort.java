package sorting;

import java.util.Arrays;

public class SQuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(arr));
        sqsort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static int partition(int[] arr,int l,int r)
    {
        int i=l-1,k=arr[r];
        for (int j = l; j < r; j++) {
            if(arr[j]<k)
            {
                i=i+1;
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
        }
        i=i+1;
        int t=arr[i];
        arr[i]=arr[r];
        arr[r]=t;
        return i;
    }
    public static void sqsort(int[] arr,int l,int r) {
        if(l<r) {

            int q = partition(arr, l, r);
            sqsort(arr, l, q - 1);
            sqsort(arr, q + 1, r);
        }
    }
}
