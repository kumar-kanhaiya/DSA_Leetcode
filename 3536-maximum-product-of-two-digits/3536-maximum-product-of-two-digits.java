class Solution {
    public int maxProduct(int n) {
        int ans = 0;
        String s = String.valueOf(n);
        for(int i = 0 ; i < s.length() ; i++){
            int first = s.charAt(i) - '0';
            for(int j = i+1 ; j < s.length() ; j++){
                int second = s.charAt(j) - '0';
                ans = Math.max(ans , first*second);
            }
        }
        return ans;
        
    }
}