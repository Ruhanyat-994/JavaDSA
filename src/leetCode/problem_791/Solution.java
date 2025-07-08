package leetCode.problem_791;

import java.util.Arrays;

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
    public static void main(String[] args) {
        Solution solution = new Solution();

        String order = "cba";
        String s = "abcccdbbaa";

        String result = solution.customSortString(order, s);

        System.out.println("Input order: " + order);
        System.out.println("Input s: " + s);
        System.out.println("Custom sorted string: " + result);
    }
}
