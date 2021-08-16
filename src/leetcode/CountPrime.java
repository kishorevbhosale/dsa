package leetcode;

public class CountPrime {
    public static void main(String[] args) {
        int flag,res=1;
        boolean[] prime = new boolean[50];
        for (int i = 3; i <= 50 ; i+=2) {
            flag = 1;
            for (int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag==1)
                res++;
        }
        System.out.println(res);
    }
}
