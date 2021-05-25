package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BasicArrayOperations {
    public static void main(String[] args) throws IOException {
        Integer[] arr = {4, 8, 13, 16, 3, 10, 12, 25, 20};
        System.out.println("Given array: " + Arrays.toString(arr));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Array Operations : \n 1) get index \n 2)set element at index \n 3) get Max \n 4) get Min " +
                "\n 5) sum of all elements \n 6) reverse by auxiliary array \n 7) reverse by swapping element \n 8) left shift by one" +
                "\n 9) right shift by one \n 10) left rotate by k element \n 11) right rotate by k element");
        System.out.println("Enter choice : ");
        int choice = Integer.parseInt(br.readLine());
        int num;
        switch (choice) {
            case 1:
                System.out.println("Enter element for searching index : ");
                num = Integer.parseInt(br.readLine());
                System.out.printf("%d present at index %d", num, getIndex(num, arr));
                break;
            case 2:
                System.out.println("Enter index: ");
                int index = Integer.parseInt(br.readLine());
                System.out.println("Enter element: ");
                num = Integer.parseInt(br.readLine());
                arr[index] = num;
                System.out.printf("%d set at index %d", num, index);
                System.out.println("Array after adding element : " + Arrays.toString(arr));
                break;
            case 3:
                System.out.printf("Max element = %d ", getMax(arr));
                break;
            case 4:
                System.out.printf("Min element = %d ", getMin(arr));
                break;
            case 5:
                System.out.printf("Sum of all elements of array = %d", getTotal(arr));
                break;
            case 6:
                reverseArrayUsingAuxArray(arr);
                System.out.println("Reverted array using aux array: " + Arrays.toString(arr));
                break;
            case 7:
                reverseArrayUsingSwap(arr);
                System.out.println("Reverted array using swapping element: " + Arrays.toString(arr));
                break;
            case 8:
                leftShiftByOne(arr);
                System.out.println("Array after one left shift: " + Arrays.toString(arr));
                break;
            case 9:
                rightShiftByOne(arr);
                System.out.println("Array after one right shift: " + Arrays.toString(arr));
                break;
            case 10:
                System.out.println("Enter rotate array by how many elements :");
                int k = Integer.parseInt(br.readLine());
                leftRotateByk(arr, k);
                System.out.println("Array after left rotate: " + Arrays.toString(arr));
                break;
            case 11:
                System.out.println("Enter rotate array by how many elements :");
                k = Integer.parseInt(br.readLine());
                rightRotateByk(arr, k);
                System.out.println("Array after right rotate: " + Arrays.toString(arr));
                break;
            default:
                System.out.println("Please enter correct choice!!!");
                break;
        }
    }

    public static void rightRotateByk(Integer[] arr, int k) {
        while (k > 0) {
            int tmp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = tmp;
            k--;
        }
    }

    public static void leftRotateByk(Integer[] arr, int k) {
        while (k > 0) {
            int tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = tmp;
            k--;
        }
    }

    public static void rightShiftByOne(Integer[] arr) {
        int i = arr.length - 1;
        while (i != 0) {
            arr[i] = arr[i - 1];
            i--;
        }
        arr[0] = 0;
    }

    public static void leftShiftByOne(Integer[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
    }

    public static void reverseArrayUsingSwap(Integer[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void reverseArrayUsingAuxArray(Integer[] arr) {
        Integer[] aux = new Integer[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            aux[i] = arr[j];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = aux[i];
        }
    }

    public static int getTotal(Integer[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static int getMin(Integer[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int getMax(Integer[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getIndex(int key, Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
