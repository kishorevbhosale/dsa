package leetcode;

public class PowerofTwo {
    public static void main(String[] args) {
        isPowerOfTwo(15);
    }
    public static boolean isPowerOfTwo(int n) {
        return  (Math.log10(n)/Math.log10(2))%1>0?false:true;
    }
}
