package leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        reverseBits(Integer.parseUnsignedInt("11111111111111111111111111111101",2));
    }
    public static int reverseBits(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        while (sb.length()<32) sb.append('0');
        System.out.println(sb.toString());
        System.out.println("10111111111111111111111111111111");
        System.out.println(Long.parseLong(sb.toString(), 2));
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}
