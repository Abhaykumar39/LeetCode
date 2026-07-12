class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);
            if (st.isEmpty() || st.peek() != ch) {
                st.push(ch);
            } else {
                st.pop();
            }
            i++;
        }

        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }

        return ans;
    }
}