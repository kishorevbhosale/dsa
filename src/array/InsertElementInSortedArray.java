package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InsertElementInSortedArray {
    public static void main(String[] args) throws IOException {
        Integer[] arr = {4, 8, 13, 16, 20, 25, 28, 33};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Array before inserting key : " + Arrays.toString(arr));
        System.out.println("Enter key : ");
        int key = Integer.parseInt(br.readLine());
        Integer[] result = insert(key, arr);
        System.out.println("Array after inserting key : " + Arrays.toString(result));
    }

    public static Integer[] insert(int key, Integer[] arr) {
        Integer[] result = new Integer[arr.length + 1];
        int i = arr.length - 1;
        int j = result.length - 1;
        while (i >= 0 && arr[i] > key) {
            result[j--] = arr[i--];
        }
        result[j--] = key;
        while (i >= 0) {
            result[j--] = arr[i--];
        }
        return result;
    }
}
