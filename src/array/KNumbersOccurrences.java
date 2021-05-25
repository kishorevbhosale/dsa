package array;

import java.util.*;

public class KNumbersOccurrences {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if (o1.getValue() == o2.getValue())
                    return o2.getKey() - o1.getKey();
                else
                    return o2.getValue()
                            - o1.getValue();
            }
        });
        for (int i = 0; i < 2; i++)
            System.out.println(list.get(i).getKey());
        System.out.println();
    }
}
