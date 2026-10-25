class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0){
            return Character.toString((char)258);
        }
        String sep = Character.toString((char)257);

        String encoded = "";
        for(String str:strs){
            encoded+=str;
            encoded+=sep;
        }
        return encoded;
    }

    public List<String> decode(String str) {
        if(str.length()==0){
            return new ArrayList<String>();
        }
        List<String> answer = new ArrayList<>();
        String word = "";

        for(char c:str.toCharArray()){
            if(c!=(char)257){
                word+=c;
            }else{
                answer.add(word);
                word = "";                
            }
        }
        return answer;
    }
}
