class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        subsets(nums, 0, new ArrayList<>(), ans);
        return ans;
    }

    void subsets(int[] nums, int i, List<Integer> curr, List<List<Integer>> ans) {
        if (i == nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        subsets(nums, i + 1, curr, ans);
        curr.remove(curr.size() - 1);

        int j = i + 1;
        while (j < nums.length && nums[j] == nums[i]) j++;
        subsets(nums, j, curr, ans);
    }
}
