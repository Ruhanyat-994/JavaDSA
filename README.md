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

<h2 align="center">Question 977</h1>

![Screenshot 2025-06-30 035617](https://github.com/user-attachments/assets/d4096011-fcdb-4e31-b69b-2460faf59643)

```java
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
```

<h2 align="center">Question 791</h1>

![Screenshot 2025-07-08 192315](https://github.com/user-attachments/assets/c404bdbc-f2c6-47d5-a994-6d8add0af91c)

```java
class Solution {
    public String customSortString(String order, String s) {
        int[] priority = new int[26];
        for(int i=0 ; i<26;i++){
            priority[i] = 26;
        }
        for(int i=0; i<order.length(); i++){
            priority[order.charAt(i) - 'a']= i;
        }
        Character[] sArray = new Character[s.length()];
        for(int i=0;i<s.length();i++){
            sArray[i]=s.charAt(i);
        }

        Arrays.sort(sArray,(a, b)-> priority[a - 'a'] - priority[b - 'a']);

        StringBuilder sb = new StringBuilder();
        for(char c: sArray){
            sb.append(c);
        }
        return sb.toString();
    }
```

<h2 align="center">Question 1710</h1>

```java
class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);

        int totalUnits = 0;

        for(int[] box : boxTypes){
            int boxCount = box[0];
            int unitsPerCount = box[1];
            if(truckSize >= boxCount){
                totalUnits += boxCount * unitsPerCount;
                truckSize -= boxCount;
            }else{
                totalUnits += truckSize * unitsPerCount;
                break;
            }
        }
        return totalUnits;
    }
}
```

<h2 align="center">Question 409</h1>

<img width="1006" height="783" alt="Screenshot 2025-08-18 010644" src="https://github.com/user-attachments/assets/0a19173f-656e-4aed-bbf0-f4135c8ddcb2" />

```java
class Solution {
    public int longestPalindrome(String s) {

        int[] freq = new int[128];
        for(char c: s.toCharArray()){
            freq[c]++;
        }

        int length = 0;
        for(int count: freq){
            length += (count/2)*2;
        }

        if(length< s.length()){
            length++;
        }
        return length;
        
    }
}
```

