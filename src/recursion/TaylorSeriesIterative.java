package recursion;

public class TaylorSeriesIterative {
    public static void main(String[] args) {
        double num = 1;
        double den = 1;
        double s = 1;
        double x = 2;
        double n = 4;
        for (int i = 1; i <= n; i++) {
            num *= x;
            den *= i;
            s += num / den;
        }
        System.out.println(s);
    }
}
