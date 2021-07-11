package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle1 {
    public static void main(String[] args) {
        for (int i = 0; i < 33 ; i++) {
            System.out.println(getRow(i));
        }

    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex==0){
            result.add(1);
            return result;
        }
        if (rowIndex==1){
            result.add(0,1);
            result.add(1,1);
            return result;
        }
        if (rowIndex>=2){
            result.add(0, 1);
            result.add(1,1);
        }
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> subList = new ArrayList<>();
            subList.add(1);
            for (int j = 1; j < i; j++) {
                subList.add(result.get(j-1)+result.get(j));
            }
            subList.add(1);
            result  = new ArrayList<>();
            result.addAll(subList);
        }
        return result;
    }

}
