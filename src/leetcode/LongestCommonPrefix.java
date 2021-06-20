package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() > str.length()) {
                minStr = str;
            }
        }
        int maxAccept = minStr.length();
        for (String str : strs) {
            if (str.substring(0, maxAccept).equalsIgnoreCase(minStr)) {
                maxAccept = minStr.length();
            } else {
                int i = 0;
                int j = 0;
                int count = 0;
                while (i < maxAccept) {
                    System.out.println(str.charAt(i) + "  " + minStr.charAt(i));
                    if (str.charAt(i) == minStr.charAt(i)) {
                        i++;
                        j++;
                        count++;
                    } else {
                        j++;
                        break;
                    }
                }
                maxAccept = j > 0 ? count : maxAccept;
            }
        }
        return minStr.substring(0, maxAccept);
    }
}
