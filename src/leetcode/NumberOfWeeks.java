package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberOfWeeks {
    public static void main(String[] args) {
        numberOfWeeks(new int[]{5,2,1});
    }

    public static void numberOfWeeks(int[] milestones) {
        List<Integer> integerList = Arrays.stream(milestones).boxed().sorted().collect(Collectors.toList());
        int count=0;
        for (int i = integerList.size()-1 ; i >=0; i--) {
            if (integerList.get(i)!=0){
                integerList.set(i, integerList.get(i)-1);
                count++;
            }
            if (i>0) {
                Collections.sort(integerList.subList(0,i-1));
                System.out.println((integerList));
            }
            if (integerList.get(i-1)!=0){
                integerList.set(i, integerList.get(i)-1);
                count++;
            }
            i=integerList.size()-1;
        }
        System.out.println(count);
    }
}