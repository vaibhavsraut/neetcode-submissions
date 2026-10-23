class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] preFix = new int[size];
        int[] postFix = new int[size];
        int[] result = new int[size];

        int last=1;
        preFix[0] = last;
        for(int index=1;index<size;index++){
            preFix[index] = nums[index-1] * last;
            last = preFix[index];
        }

        last = 1;
        postFix[size-1] = last;
        for(int index=size-2;index>=0;index--){
            postFix[index] = nums[index+1] * last;
            last = postFix[index];
        }

        for(int index=0;index<size;index++){
            result[index] = preFix[index] * postFix[index];
        }
        
        return result;        
    }
}  
