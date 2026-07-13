class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum = 0;

        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("C")) {
                st.pop();
            } else if (operations[i].equals("+")) {
                int a = st.get(st.size() - 1);
                int b = st.get(st.size() - 2);
                int result = a + b;
                st.push(result);
            } else if (operations[i].equals("D")) {
                int a = st.pop();
                int result = a * 2;
                st.push(a);
                st.push(result);
            } else {
                int num = Integer.parseInt(operations[i]);
                st.push(num);
            }

        }

        if (st.isEmpty()) {
            return 0;
        } else {
            while (st.size() > 0) {
                sum += st.pop();
            }
        }
        return sum;
    }
}