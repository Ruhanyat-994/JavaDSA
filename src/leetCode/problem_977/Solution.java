package leetCode.problem_977;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] input = {-7, -3, 2, 3, 11};
        int[] output = sol.sortedSquares(input);
        System.out.println("Sorted squares: " + Arrays.toString(output));
    }
}