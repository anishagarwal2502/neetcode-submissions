class Solution {
    int prev, current;
    public int climbStairs(int n) {
        prev = 1;
        current = 1;
        for (int i = 2; i <= n; i++) {
            int t = prev + current;
            prev = current;
            current = t;
        }
        return current;
    }
}
