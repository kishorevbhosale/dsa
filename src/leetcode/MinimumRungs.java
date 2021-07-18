package leetcode;

public class MinimumRungs {
    public static void main(String[] args) {
        System.out.println(addRungs1(new int[]{1, 3, 5, 10}, 2));
    }

    public static int addRungs(int[] rungs, int dist) {
        int count = 0;
        int tmp = 0;
        while (rungs[0] - tmp > dist) {
            tmp = tmp + dist;
            count++;
        }
        for (int i = 0; i < rungs.length - 1; i++) {
            while (rungs[i + 1] - rungs[i] > dist) {
                rungs[i] = rungs[i] + dist;
                count++;
            }
        }
        return count;
    }

    public static int addRungs1(int[] rungs, int dist) {
        int j = rungs[0];
        int count = 0;
        if ((j - dist) > 0) {
            count = (j % dist) == 0 ? (j / dist) - 1 : (j / dist);
        }
        for (int i = 0; i < rungs.length - 1; i++) {
            j = (rungs[i + 1] - rungs[i]);
            count = ((j % dist) == 0) ? count + ((j / dist) - 1) : count + (j / dist);

        }
        return count;
    }
}
