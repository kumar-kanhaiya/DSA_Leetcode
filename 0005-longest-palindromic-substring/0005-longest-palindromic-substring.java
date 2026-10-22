class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        for(int i = 0 ; i< s.length() ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i ; j < s.length() ; j++){
                sb.append(s.charAt(j));
                if(sb.toString().length() > ans.length()){
                        if(check(sb.toString())){
                            ans = sb.toString();
                        }
                    }
                }
            }
        
        return ans;
        
    }
    public static boolean check(String s ){
        if(s.length() <=1){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}