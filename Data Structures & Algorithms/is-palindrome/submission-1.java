class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }

        return true;


        // String str = "";
        // for(char c:s.toCharArray()){
        //     if(Character.isLetterOrDigit(c)){
        //         str+=c;
        //     }
        // }
        // str = str.toLowerCase();
        // int start = 0;
        // int end = str.length()-1;
        // while(start<end){
        //     if(str.charAt(start)!=str.charAt(end)){
        //         return false;
        //     }
        //     start++;
        //     end--;
        // }
        // return true;   
    }
}
