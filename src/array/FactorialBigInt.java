package array;

import java.math.BigInteger;

public class FactorialBigInt {
    public static void main(String[] args) {
        int arr[] = {5,120,75};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(fact(BigInteger.valueOf(arr[i])));
        }
    }
    static BigInteger fact(BigInteger n){
        if (n.signum()==1)
            return n.multiply(fact(n.subtract(BigInteger.ONE)));
        return BigInteger.valueOf(1);
    }
}
