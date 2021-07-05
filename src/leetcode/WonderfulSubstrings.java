package leetcode;

import java.util.*;

public class WonderfulSubstrings {
    public static void main(String[] args) {
        System.out.println(wonderfulSubstrings("aabb"));
    }
    public static long wonderfulSubstrings(String word) {
        char[] input = word.toCharArray();
        int N = input.length;
        int[] arr = new int[N];
        for(int i=0; i < N; i++)
            arr[i] = input[i]-'a';
        //numbers are from 0 to 9
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int[] map = new int[1024];
        map[0] = 1;
        int mask = 0;
        long res = 0L;
        for(int i=0; i < N; i++)
        {
            int bit = 1<<arr[i];
            mask ^= bit;
            res += map[mask];
            for(int b=0; b < 10; b++)
            {
                int temp = mask^(1<<b);
                res += map[temp];
            }
            map[mask]++;
        }
        return res;
    }
}
