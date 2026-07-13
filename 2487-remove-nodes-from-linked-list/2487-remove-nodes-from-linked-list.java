class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();

        while (head != null) {

            if (st.isEmpty()) {
                st.push(head);
            } 
            else if (head.val < st.get(st.size() - 1).val) {
                st.push(head);
            } 
            else {

                while (!st.isEmpty() && head.val > st.get(st.size() - 1).val) {
                    st.pop();
                }

                st.push(head);
            }

            head = head.next;
        }

        ListNode temp = null;

        while (!st.isEmpty()) {
            ListNode curr = st.pop();
            curr.next = temp;
            temp = curr;
        }

        return temp;
    }
}