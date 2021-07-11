package leetcode;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }


    private static int climbStairs(int n) {
        if(n<4) return n;
        int t0 = 2, t1 = 3, s = 0;
        for (int i = 4; i <= n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }
}
