package leetCode.problem_2824;

import java.util.ArrayList;
import java.util.List;

public class CountPairs {
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        nums.sort((a, b) -> a - b);
        int left = 0;
        int right = nums.size() - 1;
        while (left != right) {
            if (nums.get(left) + nums.get(right) < target) {
                count += right - left;
                left++;

            } else {
                right--;
            }
        }
        return count;
    }



    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(-1, 1, 2, 3, 1));
        int target = 2;

        CountPairs cp = new CountPairs();
        int result = cp.countPairs(numbers, target);
        System.out.println("Number of pairs with sum less than " + target + ": " + result);
    }

}
