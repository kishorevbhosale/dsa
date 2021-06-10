package leetcode;

public class ThirdMax {
    public static void main(String[] args) {
        int result = thirdMax(new int[]{1, 2, -2147483648});
        System.out.println(result);
    }

    public static int thirdMax(int[] nums) {
        int j = removeDuplicates(nums, nums.length);
        int[] arr = new int[j];
        System.arraycopy(nums, 0, arr, 0, j);
        return arr.length == 1 ? arr[0] : (arr.length == 2) ? Math.max(arr[0], arr[1]) : findThird(arr);
    }

    static int findThird(int[] arr) {
        int fmax = -2147483648;
        int smax = -2147483648;
        int tmax = -2147483648;
        int flag = 0;
        for (int value : arr) {
            if (value > fmax) {
                fmax = value;
            }
        }
        for (int value : arr) {
            if (value != fmax && value > smax) {
                smax = value;
                flag = 1;
            }
        }
        if (flag == 0) {
            smax = fmax;
        }
        int sflag = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] != fmax && arr[i] != smax)) {
                if (arr[i] >= tmax) {
                    tmax = arr[i];
                    sflag = 1;
                }
            }
        }
        if (sflag == 0) {
            tmax = fmax;
        }
        return tmax;
    }

    static int removeDuplicates(int[] arr, int n) {
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        }
        temp[j++] = arr[n - 1];
        if (j >= 0) System.arraycopy(temp, 0, arr, 0, j);
        return j;
    }
}
