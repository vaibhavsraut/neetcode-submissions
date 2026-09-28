class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        
        Arrays.sort(nums);
        for(int index=0;index<n-1;index++){
            if(nums[index]==nums[index+1]){
                return true;
            }
        }
        return false;
        
    }
}