package leetcode;

public class BuySellStock {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    private static int maxProfit(int[] prices){
        int min=prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min)
                min=prices[i];
            else{
                if (prices[i]-min>profit)
                    profit=prices[i]-min;
            }
        }
        return profit;
    }
}
