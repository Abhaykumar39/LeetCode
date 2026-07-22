class Solution {

    public int minCost(int[] dp, int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        if (dp[index] != -1)
            return dp[index];
        dp[index] = arr[index] + Math.min(minCost(dp, arr, index + 1), minCost(dp, arr, index + 2));
        return dp[index];
    }

    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(
                minCost(dp, cost, 0),
                minCost(dp, cost, 1));
    }
}