class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        
        Map<Integer, Integer> indices = new HashMap<>();

        for(int index=0;index<size;index++){
            indices.put(nums[index],index);
        }

        for(int index=0;index<size;index++){
            int diff = target - nums[index];
            if(indices.containsKey(diff) && indices.get(diff)!=index){
                return new int[] {index, indices.get(diff)};
            }
        }
        return new int[0];
    }
}
