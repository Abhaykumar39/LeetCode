class Solution {

    int unique(int m, int n, int[][] dp) {
        if (m == 1 || n == 1) {
            return 1;
        }

        if (dp[m][n] != -1) {
            return dp[m][n];
        }

        dp[m][n] = unique(m - 1, n, dp) + unique(m, n - 1, dp);
        return dp[m][n];
    }

    public int uniquePaths(int m, int n) {

        int[][] dp = new int[m+1][n+1];

        for (int i[] : dp) {
            Arrays.fill(i, -1);
        }
        return unique(m, n, dp);
    }
}