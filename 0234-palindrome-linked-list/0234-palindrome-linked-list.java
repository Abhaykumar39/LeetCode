/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        // Find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Odd length: skip middle node
        if (fast != null) {
            slow = slow.next;
        }

        // Second half starts from slow
        ListNode newList = slow;

        // Reverse second half
        ListNode temp = reverse(newList);

        while (head != null && temp != null) {
            if (head.val != temp.val) {
                return false;
            }

            head = head.next;
            temp = temp.next;
        }

        return true;
    }
}