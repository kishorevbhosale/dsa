package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 1, 3};
        System.out.println(Arrays.toString(arr));
        qsort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void qsort(int[] arr, int l, int r){
        if (l<r){
            int p = partition(arr,l,r);
            qsort(arr, l, p-1);
            qsort(arr, p+1, r);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int max = arr[high];
        int i = low-1;
        for (int j = low; j <= high-1; j++) {
            if (arr[j]<max){
                i=i+1;
                int tmp = arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        int tmp = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=tmp;
        return i+1;
    }
}
