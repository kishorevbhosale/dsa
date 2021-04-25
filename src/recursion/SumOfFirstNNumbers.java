package recursion;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        System.out.println("Sum of first 5 numbers : "+sumOfN(5));
        System.out.println("Time Complexit : O(n)");

        System.out.println("\nEasy way is use the formula n*(n+1)/2 and Time Complexit : O(1)");
    }

    private static int sumOfN(int i) {
        if (i>0){
            return sumOfN(i-1)+i;
        }
        return 0;
    }
}
