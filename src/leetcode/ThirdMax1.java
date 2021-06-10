package leetcode;

import java.util.Set;
import java.util.TreeSet;

public class ThirdMax1 {
    public static void main(String[] args) {
        //[1,1,2] , [-2147483648,-2147483648,-2147483648,-2147483648,1,1,1], [5,2,2], [1,2,2,5,3,5], [1,2,-2147483648]
        System.out.println(tmax(new int[]{2, 2, 2, 2, 2, 5}));
    }

    private static int tmax(int[] nums) {
        Set<Integer> hashSet = new TreeSet<>();
        for (int num : nums) {
            hashSet.add(num);
        }
        Object[] res;
        res = hashSet.toArray();
        if (res.length >= 3)
            return (int) res[res.length - 3];
        else if (res.length == 1) {
            return (int) res[0];
        } else if (res.length == 2) {
            return Math.max((int) res[0], (int) res[1]);
        }
        return 0;
    }
}
