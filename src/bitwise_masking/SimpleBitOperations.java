package bitwise_masking;

public class SimpleBitOperations {
    public static void main(String[] args) {
        // a = 5(00000101), b = 9(00001001)
        int a = 5, b=9; //(a=0101 b=1001)
        System.out.println(a&b); // 1
        System.out.println(a|b); // 13
        System.out.println(a^b); // 12
        System.out.println(~a); // 10
        System.out.println(b<<1); //18
        System.out.println(b>>1); //4
    }
}
