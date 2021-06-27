package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(generate(2));
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows==1){
            result.add(Collections.singletonList(1));
            return result;
        }
        if (numRows==2){
            result.add(Collections.singletonList(1));
            result.add(Arrays.asList(1,1));
            return result;
        }
        if (numRows>2){
            result.add(Collections.singletonList(1));
            result.add(Arrays.asList(1,1));
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(1);
            for (int j = 1; j < i; j++) {
                subList.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
            }
            subList.add(1);
            result.add(subList);
        }
        return result;
    }
}
