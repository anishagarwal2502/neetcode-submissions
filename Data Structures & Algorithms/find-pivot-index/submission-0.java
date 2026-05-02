class Solution {
    public int pivotIndex(int[] nums) {

        int right = 0;
        int left = 0;

        for(int i = 0; i< nums.length ;i++){
            right += nums[i];
        }

        if(0==right-nums[0]){
            return 0;
        }

        right -= nums[0];

        for(int i = 1; i<nums.length; i++){
            left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;

        }
        return -1;
    }
}