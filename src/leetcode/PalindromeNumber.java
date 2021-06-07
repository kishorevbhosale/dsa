package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(reverse(2147447412));
    }

    public static boolean reverse(int x) {
            if(x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
            int result = 0;
            while(x!=0) {
                result = result * 10 + x % 10;
                x = x / 10;
            }
            return result==x;
    }
}
