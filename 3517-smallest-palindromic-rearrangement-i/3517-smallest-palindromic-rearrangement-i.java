class Solution {
    public String smallestPalindrome(String s) {
        String g = "";
        int n = s.length();
        int len = n/2;
        if(n <= 1){
            return s;
        }
        g= s.substring(0,len);
        char[] arr = g.toCharArray();
        Arrays.sort(arr); 
        String ans = new String(arr);
        String reverse = "";
        for(int i = 0 ; i<ans.length() ; i++){
            reverse = ans.charAt(i) + reverse;
        }
        if(n%2 != 0){
            return ans+s.charAt(len) + reverse;
        }
        return ans+reverse;
    }
}