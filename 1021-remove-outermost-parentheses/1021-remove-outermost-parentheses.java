class Solution {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int check = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                if(check > 0){
                    sb.append(c);
                }
                check++;
            }
            else{
                check--;
                if(check > 0){
                    sb.append(c);
                }
            }
        }
        return sb.toString();
        
    }
}