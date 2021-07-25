package leetcode;

public class LeetCodeChallenge25July {
    public static void main(String[] args) {
        System.out.println(getLucky("leetcode", 2));
    }
    public static int getLucky(String s, int k) {
        char[] c = s.toLowerCase().toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c.length; i++) {
            sb.append(c[i]-96);
        }
        int sum = 0;
        while (k>0) {
            sum = 0;
            char[] num = sb.toString().toCharArray();
            for (int i = 0; i < num.length; i++) {
                sum += Integer.parseInt(String.valueOf(num[i]));
            }
            sb = new StringBuilder();
            sb.append(sum);
            k--;
        }
        return sum;
    }
}
