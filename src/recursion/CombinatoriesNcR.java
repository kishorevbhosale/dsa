package recursion;

public class CombinatoriesNcR {
    public static void main(String[] args) {
        int n = 4;
        int r = 2;
        System.out.println("nCr using simple recursion 4C2 = " + icom(n, r));

        System.out.println("nCr using pascal traingle 4C2 = " + ptcom(n, r));
    }

    private static int ptcom(int n, int r) {
        if (r == 0 || n == r)
            return 1;
        else
            return (ptcom(n - 1, r - 1) + ptcom(n - 1, r));
    }

    private static int icom(int n, int r) {
        int t0 = fact(n);
        int t1 = fact(r);
        int t2 = fact(n - r);
        return t0 / (t1 * t2);
    }

    private static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
}
