package leetcode;

import java.util.HashSet;

public class UniqueLengthPalindromicSubsequences {
    public static void main(String[] args) {
        System.out.println(countPalindromicSubsequence("bbcbaba"));
    }
    public static int countPalindromicSubsequence(String s) {
        int result = 0;
        HashSet<Character> skipChar = new HashSet<>();
        for (int i = 0; i < s.length()-2; i++) {
            int j=s.length()-1;

            while (!skipChar.contains(s.charAt(i)) && (j-i)>=2){
                skipChar.add(s.charAt(i));
                while(s.charAt(i)!=s.charAt(j))
                    j--;
                if(s.charAt(i)==s.charAt(j) && (j-i)>=2) {
                    HashSet<Character> checkedChar = new HashSet<>();
                    char[] chars = s.substring(i+1, j).toCharArray();
                    for (char c:chars)
                        checkedChar.add(c);
                    result += checkedChar.size();
                }
            }
        }
        return result;
    }
}
