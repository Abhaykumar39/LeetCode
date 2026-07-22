class Solution {

    public int house(int[] dp, int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }

        if (dp[index] != -1) {
            return dp[index];
        }
        int pick = arr[index] + house(dp, arr, index + 2);
        int skip = house(dp, arr, index + 1);
        dp[index] = Math.max(pick, skip);
        return dp[index];
    }

    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp, -1);
        return house(dp ,nums, 0);
    }
}