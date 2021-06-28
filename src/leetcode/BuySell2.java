package leetcode;

public class BuySell2 {
    public static void main(String[] args) {
        System.out.println(maxProfitv1(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min)
                min = prices[i];
            else {
                while (i < prices.length - 1 && prices[i] < prices[i + 1]) {
                    i++;
                }
                profit += prices[i] - min;
                if (i < prices.length - 1) {
                    min = prices[i + 1];
                    i++;
                }
            }
        }
        return profit;
    }

    //7,1,5,3,6,4
    public static int maxProfitv1(int[] prices) {
        int profit = 0;
        int i = 1;
        while (i < prices.length) {
           if (prices[i]>prices[i-1])
               profit += prices[i]-prices[i-1];
            i++;
        }
        return profit;
    }
}
