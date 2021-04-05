package array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Before reverse...");
        printArray(arr);
        reverseArray(arr);
        System.out.println("\nAfter reverse...");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArray(int[] arr){;
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int tmp = arr[start];
            arr[start]= arr[end];
            arr[end]=tmp;
            start++;
            end--;
        }
    }
}
