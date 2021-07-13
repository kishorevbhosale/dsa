package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UglyNumber {
    public static void main(String[] args) {
        //System.out.println(isUgly(14));
        System.out.println(findFactors(6));
    }
    public static boolean isUgly(int n) {
        return true;
    }

    public static boolean findFactors(int n){
        if (n == 0){
            return false;
        }
        ArrayList<Integer> factors = new ArrayList<>(Arrays.asList(2,3,5));
        for (int factor : factors){
            while (n % factor == 0){
                n /= factor;
            }
        }
        return n == 1;
    }
}
