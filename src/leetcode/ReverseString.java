package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o','o'});
    }

    public static void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        char c;
        while(i<j){
            c = s[i];
            s[i++] = s[j];
            s[j--] = c;
        }
    }
}
