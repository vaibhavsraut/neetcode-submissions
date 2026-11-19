class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        for(int index=0;index<nums.length&&nums[index]<=0;index++){
            if(index==0||nums[index]!=nums[index-1]){
                twoSum(nums,index,result);
            }
        }
          return result;
    }

    void twoSum(int[] nums, int index, List<List<Integer>> result){
        int left = index+1;
        int right = nums.length-1;
        while(left<right){
            int sum = nums[index] + nums[left] + nums[right];
            if(sum<0){
                left++;
            }else if(sum>0){
                right--;
            }else{
                result.add(Arrays.asList(nums[index],nums[left++],nums[right--]));
                while(left<right && nums[left] == nums[left-1]){
                    ++left;
                }
            }
        }
    }
}
