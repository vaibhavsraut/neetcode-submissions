class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // int size = nums.length;
        // Arrays.sort(nums);
        // int count = 1;
        // if(size==1 && k==1){
        //     return nums;
        // }
        // if(size==k){
        //     return nums;
        // }
        // Set<Integer> result = new HashSet<>();
        // for(int index=0;index<size-1;index++){
        //     if(nums[index]==nums[index+1]){
        //         count++;
        //     }

        //     if(nums[index]!=nums[index+1]){
        //         count=1;
        //     }

        //     if(count>=k){
        //         result.add(nums[index]);
        //     }
        // }
        // int[] res = new int[result.size()];
        // int i=0;
        // for(int num: result){
        //     res[i++] = num;
        // }

        // return res;

        int size = nums.length;
        Arrays.sort(nums);
        int count = 1;

        if(size==1 && k==1){
            return nums;
        }

        if(size==k){
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int index=0;index<size;index++){
            int key = nums[index];
            if(!map.containsKey(key)){
                count = 1;
                map.put(key,count);
            }else{
                count++;
                map.put(key,count);
            }
        }


        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        int[] keys = new int[size];
        Iterator<Map.Entry<Integer, Integer>> iterator = sortedMap.entrySet().iterator();
        int index = 0;

        while (iterator.hasNext()) {

            Map.Entry<Integer, Integer> entry = iterator.next();
            keys[index] = entry.getKey();
            index++;
        } 

        int[] answer = new int[k];

        for(int i=0;i<k;i++){
            answer[i] = keys[i];
        }


        return answer;           
    }
}
