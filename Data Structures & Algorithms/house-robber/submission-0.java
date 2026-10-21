class Solution {
    public int rob(int[] nums) {
        int[] t = new int[nums.length];
        t[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i == 1)
                t[i] = Math.max(nums[i], t[i - 1]);
            else
                t[i] = Math.max(nums[i] + t[i - 2], t[i - 1]);
        }
        return t[nums.length - 1];
    }
}
