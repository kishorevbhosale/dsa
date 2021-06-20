package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1563347412));

    }

    public static int reverse(int x) {
        double flag = x > 0 ? 1 : (-1);
        x = Math.abs(x);
        double result = 0;
        int rem = 0;
        do {
            rem = x % 10;
            x = x / 10;
            result = result * 10 + rem;
        } while (x != 0);
        int exppos = (int) (Math.pow(2, 31) - 1);
        int expneg = (int) (Math.pow(2, 31)) * (-1);
        int f = (int) flag;
        int r = (int) result * f;
        if ((f == -1 && r <= (expneg)) || (f == 1 && r >= exppos)) {
            return 0;
        }
        return r;
    }
}
