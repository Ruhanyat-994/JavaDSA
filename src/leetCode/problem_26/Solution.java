package leetCode.problem_26;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[unique] = nums[i];
                unique++;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.println("Modified array: " + Arrays.toString(Arrays.copyOfRange(nums, 0, k)));
    }

}

