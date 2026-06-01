class Solution {
    public int maxSubArray(int[] nums) {

        int ans = nums[0];

        for(int i = 0; i< nums.length; i++){
            int c = nums[i];
            ans = Math.max(ans, c);  
            for(int j = i+1; j<nums.length; j++){
                c+=nums[j];
                ans = Math.max(ans, c);  
            }
        }

        return ans;        
    }
}
