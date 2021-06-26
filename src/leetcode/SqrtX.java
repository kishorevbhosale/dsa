package leetcode;

public class SqrtX {
    public static void main(String[] args) {
        System.out.println(mySqrt(1997812341));
    }

    public static int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        return bSearch(1, x / 2, x);
    }

    private static int bSearch(int l, int r, int num) {
        int m = (l + r) / 2;
        if (l <= r) {
            if (m * m == num)
                return m;
            else if (m * m > num)
                return bSearch(l, (m - 1), num);
            else {
                l = (m + 1);
                return bSearch(l, r, num);
            }
        }
        return m;
    }
}
