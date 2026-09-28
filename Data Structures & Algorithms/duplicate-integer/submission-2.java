class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hash = new HashSet<>();
        for(int num:nums){
            if(hash.contains(num)){
                return true;
            } else {
                hash.add(num);
            }
        }
        return false;        
    }
}