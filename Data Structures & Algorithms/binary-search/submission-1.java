class Solution {
    public int search(int[] nums, int target) {
        return bst(nums,target, 0, nums.length-1);
    }

    public int bst(int[] nums, int target, int low, int high){
        if(low>high){
            return -1;
        }

        int idx = (low+high)/2;

        if(target == nums[idx]){
            return idx;
        }else if(target<nums[idx]){
            return bst(nums,target,low,idx-1);
        }else{
            return bst(nums,target,idx+1,high);
        }
    }


}
