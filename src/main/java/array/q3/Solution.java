package array.q3;

import java.util.Arrays;

class Solution {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 1, 1, 1, 1};
        System.out.println(Arrays.toString(arr));
        System.out.println(checkIfExist(arr));
    }
}
