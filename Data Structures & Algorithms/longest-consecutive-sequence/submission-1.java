class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        int LSC = 1;
        int Curr = 1;
        if(size == 1 || size==0){
            return size;
        }

        Arrays.sort(nums);

        for(int index=0;index<size-1;index++){
            if(nums[index+1]-nums[index]==0){
                continue;
            }
            if(nums[index+1]-nums[index]==1){
                Curr++;
                if(Curr>LSC){
                    LSC=Curr;
                }
            }else{
                Curr=1;
            }
        }
        return LSC;
        
    }
}
