class Solution {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        if(size==0 || size==1){
            return size;
        }

        int left = 0;
        int right = 0;
        int answer = 0;

        HashSet<Character> set = new HashSet<>();

        while(right<size){
            char c = s.charAt(right);
            while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(c);
            answer = Math.max(answer, right-left+1);
            right++;
        }

        return answer;        
    }
}
