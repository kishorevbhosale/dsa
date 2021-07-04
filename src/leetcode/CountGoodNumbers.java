package leetcode;

public class CountGoodNumbers {
    public static void main(String[] args) {
        System.out.println(countGoodNumbersV1(3));
        System.out.println(countGoodNumbersV2(50)); //for n =  564908303
    }
    public static int countGoodNumbersV1(long n){
        long result = 1;
        long M = 1000000007;
        if (n==1) return 5;
        if (n>1) {
            for (int i = 0; i < n-1; i+=2) {
                result = (result*=5) % M;
                result = (result*=4) % M;
            }
            if(n%2==1)
                result = (result*=5) % M;
        }
        return (int)result;
    }

    public static int countGoodNumbersV2(int n){
        return (int)(modPow(5, (n + 1) / 2) * modPow(4, n / 2) % 1000000007);
    }

    static long modPow(long x, long y)
    {
        if (y == 0)
            return 1;
        long p = modPow(x, y / 2);
        return p * p * (y % 2 > 0 ? x : 1) % 1000000007;
    }
}
