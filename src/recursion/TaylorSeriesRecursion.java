package recursion;

public class TaylorSeriesRecursion {
    static double s = 1;

    public static void main(String[] args) {
        System.out.println("Taylor series for x=2 and n=4");
        double result = tseries(2, 4);
        System.out.println(result);
    }

    private static double tseries(double x, double n) {
        if (n > 0) {
            s = 1 + x * s / n;
            return tseries(x, (n - 1));
        }
        return s;
    }
}
