class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            int[] alphabets = new int[26];
            for(int index=0;index<alphabets.length;index++){
                alphabets[index]=0;
            }
            for(int i=0;i<s.length();i++){
                alphabets[s.charAt(i)-'a']++;
                alphabets[t.charAt(i)-'a']--;
            }

            for(int index=0;index<alphabets.length;index++){
                if(alphabets[index]!=0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
