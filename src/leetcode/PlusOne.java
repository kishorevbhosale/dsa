package leetcode;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9})));
    }
    public static int[] plusOne(int[] digits) {
        int ld = digits[digits.length-1]+1;
        int carry=ld>9?1:0;
        if (carry != 0) {
            digits[digits.length-1]=ld%10;
            for (int i = digits.length-2; i >=0 ; i--)
                if ((digits[i] + carry) <= 9) {
                    digits[i] = (digits[i] + carry);
                    carry = 0;
                } else {
                    carry = 1;
                    digits[i] = (digits[i] + carry) % 10;
                }
            if (carry==0) return digits;
            else {
                int[] result = new int[digits.length+1];
                result[0]=carry;
                System.arraycopy(digits, 0, result, 1, digits.length);
                return result;
            }
        } else {
            digits[digits.length-1]=ld;
            return digits;
        }
    }
}
