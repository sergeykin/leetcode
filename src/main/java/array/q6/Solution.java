package array.q6;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int max = nums[nums.length - 1];
        int tmpmax = max;
        int cnt = 0;
        for (int i = nums.length-1; i >=0 ; i--) {

            if (tmpmax > nums[i]) {
                tmpmax = nums[i];
                cnt++;
            }
            if (cnt == 2) {
                return nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{ 2, 1, 3};
        System.out.println(Arrays.toString(nums));
        System.out.println(thirdMax(nums));
    }
}
