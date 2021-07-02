package array;

import java.util.Arrays;

public class TwoStrAnagram {
    public static void main(String[] args) {
        String a = "decimal";
        String b = "medical";
        System.out.println(isAnagram(a, b));
    }

    private static String isAnagram(String a, String b) {
        int H[] = new int[26];
        Arrays.fill(H, 0);
        for (int i = 0; i < a.length(); i++) {
            H[a.charAt(i)-97]++;
        }
        for (int i = 0; i < b.length(); i++) {
            H[b.charAt(i)-97]-=1;
            if (H[b.charAt(i)-97]!=0)
                return "No anagram";
        }
        return "Its anagram";
    }
}
