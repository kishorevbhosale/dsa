package recursion;

import java.util.Arrays;

public class FibonacciSeries {
    public static void main(String[] args) {
        int result = 0;
        int n = 6;
        System.out.println("Fibonacci series using iterative for x(6) = " + ifib(n));

        System.out.println("Fibonacci series using recursion for x(6) = " + rfib(n));

        System.out.println("Fibonacci series using recursion and memorization for x(6) = " + mfib(n));
    }

    private static int mfib(int n) {
        int[] F = new int[n + 1];
        Arrays.fill(F, -1);
        if (n <= 1) {
            F[n] = n;
            return n;
        } else {
            if (F[n - 2] == -1)
                F[n - 2] = mfib(n - 2);
            if (F[n - 1] == -1)
                F[n - 1] = mfib(n - 1);
            return F[n - 2] + F[n - 1];
        }
    }

    private static int rfib(int n) {
        if (n <= 1)
            return n;
        return rfib(n - 2) + rfib(n - 1);
    }

    private static int ifib(int n) {
        int t0 = 0, t1 = 1, s = 0;
        for (int i = 2; i <= n; i++) {
            s = t0 + t1;
            t0 = t1;
            t1 = s;
        }
        return s;
    }
}
