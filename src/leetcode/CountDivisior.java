package leetcode;

public class CountDivisior {
    public static void main(String[] args) {
        System.out.println(countDivisors(2));
    }
    public static boolean countDivisors(int n)
    {
        int cnt = 0;
        for (int i = 1; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) {
                if (n / i == i)
                    cnt++;
                else
                    cnt = cnt + 2;
            }
        }
        return cnt==3;
    }
}
