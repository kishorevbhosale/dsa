package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SetOperations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Performs set operations on sorted and unsorted array");
        System.out.println("Enter your choice :");
        System.out.println("1) Sorted");
        System.out.println("2) Unsorted");
        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                sorted(br);
                break;
            case 2:
                unsorted(br);
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }

    private static void sorted(BufferedReader br) throws IOException {
        int[] A = {3, 4, 5, 5, 5, 5, 6, 10};
        int[] B = {2, 4, 4, 4, 5, 7, 7, 7, 12};
        System.out.println("Set operations on sorted arrays");
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));
        System.out.println("Operations choices :");
        System.out.println("1) Union");
        System.out.println("2) Intersection");
        System.out.println("3) Difference");
        System.out.println("4) Membership");
        System.out.println("Enter your choice with valid number between 1 to 4");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Union Array  = " + Arrays.toString(unionSorted(A, B)));
                break;
            case 2:
                System.out.println("Intersection Array  = " + Arrays.toString(intersectionSorted(A, B)));
                break;
            case 3:
                System.out.println("Difference Array  = " + Arrays.toString(differenceSorted(A, B)));
                break;
            case 4:
                System.out.println("Enter array in which you want to search (A or B)");
                String c = br.readLine();
                if (c.equalsIgnoreCase("A") || c.equalsIgnoreCase("B")) {
                    System.out.println("Enter element to search in array");
                    int x = Integer.parseInt(br.readLine());
                    System.out.println("Element present   = " + isPresent(c, x, A, B));
                }
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }

    private static int[] differenceSorted(int[] a, int[] b) {
        int[] c = new int[a.length];
        Arrays.fill(c, 0);
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                while ((i + 1) < a.length && a[i] == a[i + 1]) {
                    i++;
                }
                k++;
                i++;
            } else if (a[i] == b[j]) {
                while ((i + 1) < a.length && a[i] == a[i + 1]) {
                    i++;
                }
                while ((j + 1) < b.length && b[j] == b[j + 1]) {
                    j++;
                }
                i++;
                j++;
            } else {
                j++;
            }
        }

        return c;
    }

    private static int[] intersectionSorted(int[] a, int[] b) {
        int[] c = new int[a.length];
        Arrays.fill(c, 0);
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] != b[j]) {
                i++;
                j++;
            } else {
                while (a[i] == b[j]) {
                    while (a[i] == a[i + 1]) {
                        i++;
                    }
                    while (b[j] == b[j + 1]) {
                        j++;
                    }
                    c[k++] = a[i++];
                    j++;
                }
            }
        }
        return c;
    }

    private static int[] unionSorted(int[] a, int[] b) {
        int[] c = new int[a.length + b.length + 1];
        Arrays.fill(c, 0);
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] != b[j]) {
                c[k++] = a[i++];
                c[k++] = b[j++];
            } else {
                c[k++] = a[i++];
                while (a[i] == a[i + 1]) {
                    i++;
                }
                while (b[j] == b[j + 1]) {
                    j++;
                }
                j++;
            }
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        return c;
    }

    private static void unsorted(BufferedReader br) throws IOException {
        int[] A = {3, 5, 10, 4, 6};
        int[] B = {12, 4, 2, 7, 5};
        System.out.println("Set operations on unsorted arrays");
        System.out.println("A = " + Arrays.toString(A));
        System.out.println("B = " + Arrays.toString(B));
        System.out.println("Operations choices :");
        System.out.println("1) Union");
        System.out.println("2) Intersection");
        System.out.println("3) Difference");
        System.out.println("4) Membership");
        System.out.println("Enter your choice with valid number between 1 to 4");

        int choice = Integer.parseInt(br.readLine());
        switch (choice) {
            case 1:
                System.out.println("Union Array  = " + Arrays.toString(unionUnsorted(A, B)));
                break;
            case 2:
                System.out.println("Intersection Array  = " + Arrays.toString(intersectionUnsorted(A, B)));
                break;
            case 3:
                System.out.println("Difference Array  = " + Arrays.toString(differenceUnsorted(A, B)));
                break;
            case 4:
                System.out.println("Enter array in which you want to search (A or B)");
                String c = br.readLine();
                if (c.equalsIgnoreCase("A") || c.equalsIgnoreCase("B")) {
                    System.out.println("Enter element to search in array");
                    int x = Integer.parseInt(br.readLine());
                    System.out.println("Element present   = " + isPresent(c, x, A, B));
                }
                break;
            default:
                System.out.println("Enter correct choice");
                break;
        }
    }

    private static boolean isPresent(String c, int x, int[] a, int[] b) {
        if (c.equalsIgnoreCase("A")) {
            for (int value : a) {
                if (value == x)
                    return true;
            }
        } else
            for (int value : b) {
                if (value == x)
                    return true;
            }
        return false;
    }

    private static int[] differenceUnsorted(int[] a, int[] b) {
        int[] c = new int[a.length];
        boolean flag = true;
        int i = 0;
        for (int item : a) {
            flag = true;
            for (int value : b) {
                if (item == value)
                    flag = false;
            }
            if (flag)
                c[i++] = item;
        }
        return c;
    }

    private static int[] intersectionUnsorted(int[] a, int[] b) {
        int[] c = new int[a.length];
        Arrays.fill(c, 0);
        int k = 0;
        for (int item : a) {
            for (int value : b) {
                if (item == value)
                    c[k++] = item;
            }
        }
        return c;
    }

    private static int[] unionUnsorted(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        Arrays.fill(c, 0);
        int k = 0;
        for (int item : a) {
            c[k++] = item;
        }
        boolean flag = false;
        for (int item : b) {
            for (int value : a) {
                if (value != item)
                    flag = true;
            }
            if (flag)
                c[k++] = item;
        }
        return c;
    }
}
