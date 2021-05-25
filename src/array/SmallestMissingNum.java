package array;

public class SmallestMissingNum {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 10};
        if (arr[0] != 0)
            System.out.println(0);
        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i + 1] - arr[i]) > 1) {
                System.out.println(arr[i] + 1);
                break;
            }
        }
    }
}
