class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            int[] arr = new int[26];
            for(int index = 0;index<s.length();index++){
                arr[s.charAt(index)-'a']++;
                arr[t.charAt(index)-'a']--;
            }

            for(int index = 0;index<arr.length;index++){
                if(arr[index]!=0){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
