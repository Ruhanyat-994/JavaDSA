package leetCode.problem_167;

public class TwoSum2 {

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                return new int[]{left + 1, right + 1};
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        if (result != null) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
    }
}
