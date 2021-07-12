package leetcode;

public class CountSquareSumTriples {
    public static void main(String[] args) {
        getCount(10);
    }

    private static void getCount(int n){
        int count = 0;

        for(int a=1;  a<=n-2;  a++){

            for(int b=a+1;  b<=n-1;  b++){

                for(int c=b+1;  c<=n;  c++){

                    int LHS = a* a + b* b;
                    int RHS = c* c;

                    if(LHS == RHS) {
                        System.out.println(a + " + " + b + " = " + RHS);
                        count += 2;   // (a,b) or (b,a)
                    }

                }
            }
        }
    }
}
