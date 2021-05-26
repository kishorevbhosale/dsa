package array;

import java.util.Arrays;



public class LinearSearchImproved {
    public static void main(String[] args) {
        int[] arr = {13,4,23,66,9,5,70,11,56,34,98,22,10,8,33};
        System.out.println("Array : "+ Arrays.toString(arr));
        int k = 5;
        int index = search(arr,k);
        System.out.println("Is 5 present :"+(index != -1));
        System.out.println("present at index :"+index);

        System.out.println("\nSearching 5 again");
        System.out.println("Array improved : "+ Arrays.toString(arr));
        index = search(arr,k);
        System.out.println("Is 5 present :"+(index != -1));
        System.out.println("present at index :"+index);

        System.out.println("\nSearching 5 again");
        System.out.println("Array improved : "+ Arrays.toString(arr));
        index = search(arr,k);
        System.out.println("Is 5 present :"+(index != -1));
        System.out.println("present at index :"+index);
    }

    private static int search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==k){
                int tmp = arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=tmp;
                return i;
            }
        }
        return -1;
    }
}
