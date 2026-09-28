class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        int sSize = sArray.length;
        int tSize = tArray.length;

        if(sSize!=tSize){
            return false;
        }

        for(int index=0;index<sArray.length;index++){
            if(sArray[index]!=tArray[index]){
                return false;
            }
        }
        return true;
    }
}
