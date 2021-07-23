package leetcode;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,1,3}));
    }
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<nums.length;i++)hashSet.add(nums[i]);
        return hashSet.size()<nums.length?true:false;
    }
}
