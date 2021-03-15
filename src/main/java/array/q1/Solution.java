package array.q1;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = 0;
        int tmp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != tmp) {
                len++;
                nums[len] = nums[i];
                tmp = nums[i];
            }
        }
        return len+1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 2};
        int len = removeDuplicates(nums);
        for (int i = 0; i < len; i++) {
            System.out.println( nums[i] );
        }

        System.out.println("len="+len);
    }
}

