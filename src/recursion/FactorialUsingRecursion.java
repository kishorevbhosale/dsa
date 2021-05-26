package recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println(" 5! = " + fact(5));
        System.out.println("Time Complexit : O(n)");
    }

    private static int fact(int i) {
        if (i == 0 || i == 1)
            return 1;
        else
            return fact(i - 1) * i;
    }
}
