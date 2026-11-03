class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length()==t.length()){
        int[] indices = new int[26];
        for(int index=0;index<indices.length;index++){
        indices[index] = 0;
       }

       for(int index=0;index<s.length();index++){
        indices[s.charAt(index)-'a']++;
        indices[t.charAt(index)-'a']--;        
       }

       for(int index=0;index<indices.length;index++){
        if(indices[index]!=0){
            return false;
        }        
       }
       return true;
       }

       return false;
    }
}
