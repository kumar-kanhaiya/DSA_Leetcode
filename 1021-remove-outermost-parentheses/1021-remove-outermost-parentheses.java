class Solution {
    public static String removeOuterParentheses(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();
                String check = "";
        
        for(int i = 0 ; i< s.length() ; i++){
        
    
                // stack.push(s.charAt(i));
                // while(!stack.isEmpty()){
                //     if(s.charAt(i) == '('){
                //         stack.push(s.charAt(i));
                //         i++;
                //     }
                //     else{
                //         check += stack.pop();
                //     }
                // }
                if(s.charAt(i) == '('){
                    stack.push(s.charAt(i));
                    check += s.charAt(i);
                }
                else{
                     stack.pop();
                    check += s.charAt(i);
                    
                }
                if(stack.isEmpty()){
                    ans += check.substring(1, check.length() - 1);
                    check = "";
                }
            
        }
        return ans;
        
    }
}