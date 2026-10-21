class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int index=0;index<nums.length;index++){
            if(map.containsKey(target-nums[index])){
                return new int[]{map.get(target-nums[index]), index};
            }
            map.put(nums[index], index);
        }
        return new int[]{};
    }
}
