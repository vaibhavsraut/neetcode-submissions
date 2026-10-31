class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        if(size==0 || size==1){
            return 0;
        }

        int max = height[0];
        for(int index=0;index<size;index++){
            max = Integer.max(height[index], max);
            leftMax[index]=max;
        }

        max = height[size-1];
        for(int index=size-1;index>=0;index--){
            max = Integer.max(height[index], max);
            rightMax[index]=max;
        } 

        int water = 0;

        for(int index=0;index<size;index++){
            int count = Integer.min(leftMax[index],rightMax[index]) - height[index];
            if(count>0){
                water+=count;
            }
        }  
        return water; 
    }
}
