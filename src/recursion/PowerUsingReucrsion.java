package recursion;

public class PowerUsingReucrsion {
    public static void main(String[] args) {
        System.out.println(" 2**5 : "+power(2,5));
        System.out.println("Time Complexit : O(n)");
    }

    private static int power(int m, int n) {
        if (n==0)
            return 1;
        else
            return power(m,n-1)*m;
    }
}
