package leetcode;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] num = {{8, 2}, {3, 4}};
        maximumWealth(num);
    }

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for (int[] num : accounts) {
            sum = 0;
            for (int n : num) {
                sum += n;
            }
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
        return max;
    }
}
