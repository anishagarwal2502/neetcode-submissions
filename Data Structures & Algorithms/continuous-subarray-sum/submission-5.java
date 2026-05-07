class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        /*
        for(int i = 0; i<nums.length-1; i++){
            int sum = nums[i];
            for (int j = i+1; j<nums.length; j++){
                sum += nums[j];
                if( (sum % k) == 0) return true;
            }
        }

        */

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum = 0;

        for(int i = 0; i<nums.length; i++){
            sum+= nums[i];
            int rem = sum % k;
            if(map.containsKey(rem)){
                int idx = map.get(rem);
                if(Math.abs(i-idx)>=2){
                    return true;
                }
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }
}