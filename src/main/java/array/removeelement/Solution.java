package array.removeelement;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            while (nums[i] == val & len > 0 & (i < len)) {
                nums[i] = nums[len - 1];
                len--;
            }
        }
        return len;
    }

    public static void main(String[] args) {
        // nums is passed in by reference. (i.e., without making a copy)
        int[] nums = new int[]{
            1, 2, 2, 2, 2, 3, 4} ;
        int val = 2;
        int len = removeElement(nums, val);

// any modification to nums in your function would be known by the caller.
// using the length returned by your function, it prints the first len elements.
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
