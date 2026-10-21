class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f = cost[cost.length - 1], s = cost[cost.length - 2];
        for (int i = cost.length - 3; i >= 0; i--) {
            int t = cost[i] + Math.min(f, s);
            f = s;
            s = t;
        }
        return Math.min(f, s);
    }

    int helper(int[] cost, int i) {
        if (i >= cost.length)
            return 0;
        return -1;
    }
}
