package leetcode;

public class StrStrIndexOf {
    public static void main(String[] args) {
        String s1 = "babba";
        String s2 = "bbb";
        System.out.println(strStr(s1, s2));
    }

    public static int strStr(String haystack, String needle) {
        int hlen = haystack.length();
        int nlen = needle.length();
        if (hlen < nlen) return -1;
        if (hlen==0 || nlen==0) return 0;

        int tmpk;
        boolean flag;
        for (int i = 0, k = 0; i <= hlen - nlen; i++) {
            if (haystack.charAt(i) == needle.charAt(k) && haystack.charAt(i + nlen-1) == needle.charAt(nlen - 1)) {
                int starti = i;
                int endi = i + nlen - 1;
                int startk = k;
                int endk = nlen - 1;
                tmpk = i;
                flag = true;
                while (flag && starti <= endi) {
                    flag = haystack.charAt(starti++) == needle.charAt(startk++) && haystack.charAt(endi--) == needle.charAt(endk--);
                }
                if (flag) return tmpk;
            }
        }
        return -1;
    }
}
