package array;

import java.util.Stack;

public class LRStringValidation {
    public static void main(String[] args) {
        String str = "RLLLLRRRLR";
        int count = 1;
        int len = str.length();
        int i=1;
        char c = str.charAt(0);
        int result = 0;
        while(i<len){
            if (c==str.charAt(i))
                count++;
            else
                count--;
            if (count==0) {
                if(i<len-1)
                    c = str.charAt(i + 1);
                count=1;
                i=i+1;
                result++;
            }
            i++;
        }
        System.out.println(result);
    }
}
