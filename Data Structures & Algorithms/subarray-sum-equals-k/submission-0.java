class Solution {
    public int subarraySum(int[] nums, int k) {

        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        int count = 0;

        for(int i = 1; i<nums.length; i++){
            prefix[i] = nums[i] + prefix[i-1];
        }

        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(i==0){
                    if(prefix[j] == k) count++;
                }else{
                    if(prefix[j] - prefix[i-1] == k) count++;
                }
            }
        }
        return count;
        
    }
}