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
    public ListNode oddEvenList(ListNode head) {
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode temp = head;
        ListNode t1 = d1;
        ListNode t2 = d2;
        ListNode t3 = head;
        int size = 0;
        while(t3!=null)
        {
            size++;
            t3 = t3.next;
        }

        for(int i=1;i<=size;i++)
        {
            if(i%2!=0)
            {
                t1.next = temp;
                t1 = t1.next;
                
            }
            else
            {
                t2.next = temp;
                t2 = t2.next;
            }

            temp = temp.next;
        }

        t1.next = d2.next;
        t2.next = null;
        return d1.next;
    }
}