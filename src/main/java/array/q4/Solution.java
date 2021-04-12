package array.q4;

import java.util.Arrays;

public class Solution {
    public static boolean validMountainArray(int[] arr) {
        int top = 0;
        if (arr.length <3)
        {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1] && top == 0) {
                continue;
            } else if (arr[i] < arr[i - 1] && top == 1) {
                continue;
            } else if (arr[i] < arr[i - 1] && top == 0 && i != 1) {
                top = 1;
                continue;
            } else {
                return false;
            }

        }
        if (top == 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 4};
        System.out.println(Arrays.toString(arr));
        System.out.println(validMountainArray(arr));
    }
}
