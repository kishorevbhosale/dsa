package array;

public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key = 30;
        boolean flag = false;
        int tmp = arr[0];
        if (tmp > key) {
            for (int i = arr.length - 1; i > 0; i--) {
                if (arr[i] == key) {
                    flag = true;
                    System.out.println(key + " found at index : " + i);
                    break;
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    flag = true;
                    System.out.println(key + " found at index :" + i);
                    break;
                }
            }
        }
        if (!flag) {
            System.out.println(key + " not present in array");
        }
    }
}
