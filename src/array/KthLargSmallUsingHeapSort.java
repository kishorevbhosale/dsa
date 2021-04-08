package array;

import java.util.Arrays;

public class KthLargSmallUsingHeapSort {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(Arrays.toString(arr));
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(k+" th smallest element from the array = "+arr[k-1]);
        System.out.println(k+" th largest element from the array = "+arr[arr.length-k]);
    }
    public static void swap(int[] arr,int i, int j){
        int tmp = arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
    public static void heapSort(int[] arr){
        int n = arr.length-1;
        for (int i = n/2; i >=0 ; i--) {
            heapify(arr,n,i);
        }
        for (int i = n; i >0 ; i--) {
            swap(arr,i,0);
            heapify(arr,i,0);
        }
    }

    public static void heapify(int[] arr,int n, int i){
        int l = 2*i+1;
        int r = 2*i+2;
        int largest = i;
        if (l<n && arr[largest]<arr[l]){
            largest=l;
        }
        if (r<n && arr[r]>arr[largest]){
            largest=r;
        }
        if (largest!=i){
            swap(arr,i,largest);
            heapify(arr,n,largest);
        }
    }
}
