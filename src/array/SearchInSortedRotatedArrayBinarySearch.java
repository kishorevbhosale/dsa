package array;

public class SearchInSortedRotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 7;
        int index = search(arr, 0, arr.length - 1, key);
        System.out.println(key + " found at index : " + index);
    }

    public static int search(int[] arr, int l, int r, int key) {
        int mid = r - l / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[l] <= arr[mid]) {
            if (key >= arr[l] && key <= arr[mid]) {
                return search(arr, l, mid - 1, key);
            }
            return search(arr, mid + 1, r, key);
        }
        if (key >= arr[mid] && key <= arr[r]) {
            return search(arr, mid + 1, r, key);
        }
        return search(arr, l, mid - 1, key);

    }
}
