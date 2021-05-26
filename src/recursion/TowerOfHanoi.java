package recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        System.out.println("Tower of hanoi");
        System.out.println("disc = 4, tower 1, tower 2, tower 3");
        toh(3, 1, 2, 3);
    }

    private static void toh(int n, int a, int b, int c) {
        if (n > 0) {
            toh(n - 1, a, c, b);
            System.out.println("(" + a + "," + c + ")");
            toh(n - 1, b, a, c);
        }
    }
}
