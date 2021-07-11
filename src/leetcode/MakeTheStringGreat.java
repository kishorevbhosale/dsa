package leetcode;

public class MakeTheStringGreat {
    public static void main(String[] args) {
        System.out.println(makeGood("leEeEtcCode"));
    }
    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        s = s.toLowerCase();
        for (int i = 0; i < sb.length()-1; i++) {
            s = s.toLowerCase();
            if ((s.charAt(i)==s.charAt(i+1)) && (sb.charAt(i)!=sb.charAt(i+1))) {
                    s = (i-1>=0)?sb.substring(0, i) + sb.substring(i + 2): sb.substring(i + 2);
                    sb = new StringBuilder(s);
                    i = -1;
                }
            }
        return sb.toString();
    }
}
