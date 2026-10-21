class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] t = new int[cost.length];
        t[cost.length-1] = cost[cost.length-1];
        t[cost.length-2] = cost[cost.length-2];
        for (int i = cost.length-3; i>=0; i--) t[i] = Math.min(cost[i]+t[i + 2], cost[i]+t[i + 1]);
        System.out.println(Arrays.toString(t));
        return Math.min(t[0], t[1]);
    }

    int helper(int[] cost, int i){
        if(i>=cost.length) return 0;
        return -1;
    }
}
