package leetcode;

public class LeetCodeContest2481 {
    public static void main(String[] args) {
        System.out.println(getNum(50));
    }
    // 564908303
    // 564908303
    public static int getNum(long n){
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
}
