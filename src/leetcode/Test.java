package leetcode;

public class Test {
    public static void main(String[] args) {
        String s = "12:15";
        System.out.println(time(s));
    }

    static int time(String t)
    {
        char[] s = t.toCharArray();
        int h = (s[0]-'0')*10 + (s[1]-'0');
        int m = (s[3]-'0')*10 + (s[4]-'0');
        return h*60+m;
    }
}
