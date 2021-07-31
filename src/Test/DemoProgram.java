package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoProgram {
    public static void main(String[] args) {
       // {7,5,2,9} // op=7
        int[] list = new int[]{7,5,2,9,11};
        int fmax=0;
        int smax=0;
        boolean flag=false;
        for (int i = 0; i < list.length; i++) {
            if (fmax<list[i]) {
                fmax = list[i];
                flag=true;
            }
            if (list[i]<fmax && list[i]>smax){
                if (flag) {
                    smax = fmax;
                }else {
                    smax=list[i];
                }
            }
        }
        System.out.println(smax);


    }
}
