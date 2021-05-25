package array;

public class IsArraySorted {
    public static void main(String[] args) {
        Integer[] arr = {4, 13, 15, 23, 25, 33};
        System.out.println("Is array sorted : " + isArraySorted(arr));
    }

    public static boolean isArraySorted(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
