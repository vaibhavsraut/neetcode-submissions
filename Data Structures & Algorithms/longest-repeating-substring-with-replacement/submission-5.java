class Solution {
    public int characterReplacement(String s, int k) {
        int[] occurances = new int[26];
        int left = 0;
        int answer = 0;
        int maxOccurances = 0;
        for(int right=0;right<s.length();right++){
            occurances[s.charAt(right)-'A']++;
            maxOccurances = Math.max(maxOccurances,occurances[s.charAt(right)-'A']);

            while((right-left+1)-maxOccurances>k){
                occurances[s.charAt(left)-'A']--;
                left++;
            }
            answer=Math.max(answer,right-left+1);
        }
        return answer;
    }
}
