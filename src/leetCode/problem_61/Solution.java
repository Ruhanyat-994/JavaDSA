package leetCode.problem_61;

public class Solution {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

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

    public static void main(String[] args) {
        // Create the list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        Solution sol = new Solution();
        ListNode rotated = sol.rotateRight(head, k);

        // Print the rotated list
        System.out.print("Rotated List: ");
        while (rotated != null) {
            System.out.print(rotated.val + " ");
            rotated = rotated.next;
        }
    }
}
