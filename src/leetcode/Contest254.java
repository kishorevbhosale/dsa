package leetcode;

import java.util.Arrays;

public class Contest254 {
    public static void main(String[] args) {
        //numOfStrings(new String[]{"a","abc","bc","d"},"abc");
        // rearrangeArray(new int[]{0,12,8,14,9,13,17,15});
        minNonZeroProduct(4);

    }
    public static void numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i]))
                count++;
        }
        System.out.println(count);
    }

    public static void rearrangeArray(int[] nums){
        Arrays.sort(nums);
        for (int i = 1; i < nums.length-1; i++) {
            if ((nums[i-1]+nums[i+1])/2==nums[i]){
                int tmp = nums[i];
                nums[i]=nums[(nums.length-1)];
                nums[(nums.length-1)]=tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void minNonZeroProduct(int p) {
        int n = (int)Math.pow(2,p);
        int m = (n-1);
        int mod = 1000000007;
        int num = (int)Math.pow(n-2,m)%mod;
        System.out.println(num);
        System.out.println(num*(n-1)%mod);

    }
}

     /*  n = 2 ** p
         m = (n - 1) // 2
         MOD = 1000000007
         return pow(n - 2, m, MOD) * (n - 1) % MOD
*/

/*
Input:4
Output: 1581202560
Expected:581202553
*/
