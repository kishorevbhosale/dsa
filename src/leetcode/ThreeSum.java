package leetcode;

import java.util.*;
import java.util.stream.Collectors;

public interface ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{1,0,-1}));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<=1) return Collections.emptyList();
        Arrays.sort(nums);
        List<List<Integer>> resultList = new ArrayList<>();
        int i=0;
        for (; nums[i] <= 0 && i<=nums.length-2; i++) {
            int j =i+1;
            int k=nums.length-1;
            while (j<k){
                List<Integer> sumList = new ArrayList<>();
                if (nums[i]+nums[j]+nums[k]==0){
                    sumList.add(nums[i]);
                    sumList.add(nums[j]);
                    sumList.add(nums[k]);
                    resultList.add(sumList);
                    j++;
                    k--;

                }
                else if (nums[i]+nums[j]+nums[k]<0)
                    j++;
                else
                    k--;
            }
        }
        return resultList.stream().distinct().collect(Collectors.toList());
    }
}
