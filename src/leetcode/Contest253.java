package leetcode;

import java.util.Arrays;

public class Contest253 {
    public static void main(String[] args) {
        //System.out.print(isPrefixString("i", new String[]{"iii","love","leetcode"}));
        minStoneSum1(new int[]{4,3,6,7},3);
    }
    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
       for (String str : words) {
           if (s.length() > sb.length())
               sb.append(str);
       }
          if (s.equals(sb.toString())){
               return true;
          }else
               return false;


    }

    public static void minStoneSum(int[] piles, int k) {
        Arrays.sort(piles);
        while (k>0) {

            int num = 0;

            if (piles[piles.length - 1]>piles[piles.length - 2]) {
                num = (piles[piles.length - 1] % 2 == 0) ? piles[piles.length - 1] : piles[piles.length - 1] + 1;
            }else {
                num = (piles[piles.length - 2] % 2 == 0) ? piles[piles.length - 2] : piles[piles.length - 2] + 1;
            }
            piles[piles.length - 1] = num / 2;
            k--;
        }
        System.out.println(Arrays.stream(piles).sum());
    }

    public static void minStoneSum1(int[] piles, int k) {

    }
}
