class Solution {
    public int longestConsecutive(int[] nums) {
        int size = nums.length;
        int lsc = 1;
        if(size == 1 || size==0){
            return size;
        }

        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        for(int num:set){
            if(set.contains(num-1)){
                continue;
            }else{
                int curr = num;
                int currSub = 1;
                while(set.contains(curr+1)){
                    currSub++;
                    curr++;
                }
                lsc = Math.max(lsc,currSub);
            }

        }
        return lsc;
        
    }
}
