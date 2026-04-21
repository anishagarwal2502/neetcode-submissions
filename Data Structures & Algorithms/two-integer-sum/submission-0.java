class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         Set<Integer> s = new HashSet<>();

        for (int i = 0; i < nums.length; ++i) {
            s.add(nums[i]);
        }

        for (int i = 0; i < nums.length; ++i) {
            int balance = target - nums[i];
            if (s.contains(balance)) {
                for (int j = i + 1; j < nums.length; ++j) {
                    if (nums[j] == balance) {
                        return new int[] { i, j };
                    }
                }

            }
        }
        return new int[] { 0, 0 };
    }
}
