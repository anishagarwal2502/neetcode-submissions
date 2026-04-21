class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for(int a: nums){
            if(numbers.contains(a)){
                return true;
            }else{
                numbers.add(a);
            }
        }
        return false;
    }
}