package leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1, 1, 1, 1, 2, 2, 4, 4, 4, 4, 4, 4, 4, 4, 4};
        System.out.println(bruteForce(nums));
        System.out.println(hashMap(nums));
        System.out.println(usingSorting(nums));
        System.out.println(boyerMooreVotingAlgo(nums));
    }

    private static int bruteForce(int[] nums) {
        for (int n : nums) {
            int count = 0;
            for (int x : nums) {
                if (x == n) count++;
            }
            if (count > nums.length / 2)
                return n;
        }
        return -1;
    }

    private static int hashMap(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : nums) {
            if (hashMap.containsKey(n))
                hashMap.put(n, hashMap.get(n) + 1);
            else
                hashMap.put(n, 1);
            if (hashMap.get(n) > nums.length / 2) return n;
        }
        return -1;
    }

    private static int usingSorting(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    private static int boyerMooreVotingAlgo(int[] nums){
        int count=0;
        int candidate=0;
        for (int n : nums){
            if (count==0)
                candidate = n;
            count+=(n==candidate)?1:-1;
        }
        return candidate;
    }
}
