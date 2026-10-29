class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int size = nums.length;
        int start = 0;
        int end = size-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                return new int[]{start, end};
            }
            end--; 
            if(nums[start]+nums[end]!=target && start+1==end){
                end = size-1;
                start++;                                
            } 
        }

        return new int[]{};


        // HashMap<Integer, Integer> map = new HashMap<>();

        // for(int index=0;index<nums.length;index++){
        //     if(map.containsKey(target-nums[index])){
        //         return new int[]{map.get(target-nums[index]), index};
        //     }
        //     map.put(nums[index], index);
        // }
        // return new int[]{};
    }
}
