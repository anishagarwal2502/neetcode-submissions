class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return climbStairsHelper(n);
    }

    int climbStairsHelper(int n) {
        if (n < 2)
            return 1;
        if (dp[n] != -1)
            return dp[n];
        dp[n] = climbStairsHelper(n - 1) + climbStairsHelper(n - 2);
        return dp[n];
    }
}
