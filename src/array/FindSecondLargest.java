package array;

public class FindSecondLargest {
    public static void main(String[] args) {
        int arr[] = { 12, 35, 1, 10, 34, 1 };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        System.out.println(arr[arr.length-2]);  //complexit O(nk) k=2 // Bubble sort for 2 pass only
    }
}
