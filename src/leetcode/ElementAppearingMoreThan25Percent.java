package leetcode;

public class ElementAppearingMoreThan25Percent {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 6, 6, 6, 6, 7};
        float n = (float) (arr.length * (0.25));


        float min_cnt = (float) (arr.length * (0.25));
        System.out.println(min_cnt);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                int j = i;
                int cnt = 1;
                while (arr[j] == arr[j + 1]) {
                    j++;
                    cnt++;
                }
                if (cnt > min_cnt)
                    System.out.println(arr[i]);
                i = j;
            }
        }
        System.out.println(0);
    }
}
