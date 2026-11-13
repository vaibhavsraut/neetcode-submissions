class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet hashSet = new HashSet();
        for(int i=0;i<n;i++){
            if(hashSet.contains(nums[i])){
                return true;
            } else {
                hashSet.add(nums[i]);
            }
        }
        return false;        
    }
}