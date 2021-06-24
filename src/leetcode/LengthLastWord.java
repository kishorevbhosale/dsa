package leetcode;

public class LengthLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWordV1("  "));
    }

    public static int lengthOfLastWord(String s) {
        if (s.isEmpty()) return 0;
        String[] str = s.split(" ");
        if (str.length == 1) return str[0].length();
        for (int i = str.length - 1; i > 0; i--) {
            if (!str[i].isEmpty())
                return str[i].length();
        }
        return 0;
    }

    public static int lengthOfLastWordV1(String s) {
        int tmp;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                tmp = i;
                while (i>=0 && s.charAt(i) != ' ') {
                    i--;
                }
                return tmp - i;
            }
        }
        return 0;
    }
}
