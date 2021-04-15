package array;

public class AlternativeSorting {
    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 4, 3, 7, 8, 2};
        sort(arr, 0, arr.length - 1);

        for (int i = 0, j = arr.length - 1; ((i < arr.length - 1) && (j > 0)); i += 2, j -= 2) {
            System.out.print(arr[j] + " , " + arr[i] + " , ");
        }


    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; //3
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int n1 = (m - l) + 1;
        int n2 = (r - m);
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }


}
