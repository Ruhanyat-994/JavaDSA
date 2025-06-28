<h1 align="center">My Leetcode Approach</h1>

<h2 align="center">Question 2894</h1>

![2894](https://github.com/user-attachments/assets/5e9dd850-7e38-445e-87ab-7134cf95e706)

```java
public class leetcode2894 {

        public static int differenceOfSums(int n, int m) {

            int x = n/m;
            int num2 = m*x*(x+1)/2;
            int num1 = n*(n+1)/2 - num2;

            return num1-num2;

    }
```


<h2 align="center">Question 2824</h1>

![Screenshot 2025-06-23 011227](https://github.com/user-attachments/assets/8ddfb370-9ad6-4dd9-ac8d-9ae0bc6a186f)


```java
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
    
```

<h2 align="center">Question 167</h1>

![Screenshot 2025-06-24 003930](https://github.com/user-attachments/assets/2a994de2-5c17-4618-91ed-cdfce5c77064)


```java
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

```

<h2 align="center">Question 61</h1>

![Screenshot 2025-06-25 082134](https://github.com/user-attachments/assets/3ea75602-f92a-4ec6-be6a-71d13cfd2e68)


```java
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;

        ListNode tail = head;
        int length = 1;
        while(tail.next != null) {
            tail = tail.next;
            length++;
        }
        tail.next = head; // Make it circular

        k = k % length;
        int stepsToNewHead = length - k;

        ListNode newTail = head;
        for(int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        head = newTail.next;
        newTail.next = null;

        return head;
    }
```

<h2 align="center">Question 26</h1>

![Screenshot 2025-06-29 054621](https://github.com/user-attachments/assets/37138a5f-e4d2-49a3-b7af-58e0d378f953)

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int unique =1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[i-1]){
                unique++;
                nums[unique-1] = nums[i];
            }
        }
        return unique;
        
    }
}
```



