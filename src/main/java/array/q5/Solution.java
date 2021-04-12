package array.q5;

import java.util.Arrays;

class Solution {
    public static int heightChecker(int[] heights) {
        int[] res = new int[heights.length];
        res = heights.clone();
        Arrays.sort(res);
        //System.out.println(Arrays.toString(res));
        int cnt = 0;
        for (int i = 0; i < heights.length; i++) {
            if (res[i] != heights[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5, 2};
        System.out.println(Arrays.toString(mas));
        System.out.println(heightChecker(mas));
    }

}
