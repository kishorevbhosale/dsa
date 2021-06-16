package leetcode;

import java.util.HashSet;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println(findLongestSubString(str));
    }

    private static int findLongestSubString(String str) {
        if (str.length() == 0) {
            return 0;
        }
        HashSet<Character> hs = new HashSet<>();
        int j = 0;
        int maxlength = 0;
        for (int i = 0; i < str.length(); i++) {
            j = i;
            while (j < str.length() && !hs.contains(str.charAt(j))) {
                hs.add(str.charAt(j++));
            }
            if (maxlength < hs.size()) {
                maxlength = hs.size();
            }
            hs.clear();
        }
        return maxlength;
    }
}
