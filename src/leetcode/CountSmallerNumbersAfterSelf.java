package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountSmallerNumbersAfterSelf {
    public static void main(String[] args) {
        int[] arr = {5,5,5,-20,-10,-5,-7,4,-9,1,-20,-10,2,1,1,-1,-2,-3,4,-1,-9};
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i>0 && arr[i]==arr[i-1]) {
                res.add(res.get(i - 1));
            } else {
                int count = 0;
                for (int j = i + 1, k = arr.length - 1; j <= k; j++, k--) {
                    if (j == k && arr[j] < arr[i]) count++;
                    else {
                        if (arr[j] < arr[i]) count++;
                        if (arr[k] < arr[i]) count++;
                    }
                }
                res.add(count);
            }
        }
        System.out.println(res);
    }
}
