class Solution {
    public int maxArea(int[] heights) {
        int max = 0, s = 0, n = heights.length, e = n - 1;

        while (s < e) {
            max = Math.max(max, (e - s) * Math.min(heights[e], heights[s]));
            if (heights[s] < heights[e])
                s++;
            else
                e--;
        }

        return max;
    }
}
