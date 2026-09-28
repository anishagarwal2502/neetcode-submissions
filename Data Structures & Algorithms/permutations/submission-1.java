class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        permute(nums, new boolean[nums.length], res, new ArrayList<>());
        return res;
    }

    void permute(int[] nums, boolean[] visited, List<List<Integer>> res, List<Integer> curr) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                curr.add(nums[i]);
                permute(nums, visited, res, curr);
                visited[i] = false;
                curr.remove(curr.size() - 1);
            }
        }
    }
}
