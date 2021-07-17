package leetcode;

public class NumberOf1Bits {
    public static void main(String[] args) {
        System.out.println(hammingWeightV1(Integer.parseUnsignedInt("111",2)));
    }
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='1') count++;
        }
        return count;
    }

    public static int hammingWeightV1(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}
