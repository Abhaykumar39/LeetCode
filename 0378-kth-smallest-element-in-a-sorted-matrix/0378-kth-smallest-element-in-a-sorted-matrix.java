class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int arr[] : matrix) {
            for (int i : arr) {
                list.add(i);
            }
        }

        Collections.sort(list);

        int ans = list.get(k - 1);

        return ans;
    }
}