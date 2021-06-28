package leetcode;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("8V8K;G;K;V;"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toUpperCase();
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            if (!(isValid(chars[i]))) i++;
            if (!(isValid(chars[j]))) j--;
            if (isValid(chars[i]) && isValid(chars[j])) {
                if (chars[i] != chars[j])
                    return false;
                i++;
                j--;
            }
        }
        return true;
    }

    private static boolean isValid(char ch) {
        return (ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90);
    }

    public static boolean isPalindromeV1(String s){
        s = s.toUpperCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(j))) {
                if (s.charAt(i) != s.charAt(j))
                    return false;
                i++;
                j--;
            } else {
                if (!(Character.isLetterOrDigit(s.charAt(i)))) i++;
                if (!(Character.isLetterOrDigit(s.charAt(j)))) j--;
            }
        }
        return true;
    }
}
