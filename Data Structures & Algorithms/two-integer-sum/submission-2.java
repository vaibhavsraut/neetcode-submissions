class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap map = new HashMap();
        for(int index=0;index<nums.length;index++){
            int component = target - nums[index];
            if(map.containsKey(component)){
                return new int[] {(int) map.get(component), index};
            }
            map.put(nums[index], index);
        }

        return new int[]{};
        
    }
}
