class Solution {
    public int gcdOfOddEvenSums(int n) {
        int odd = n*n;
        int even = (n*(n+1));
        int min = Math.min(odd , even);
        int ans = 1;
        if(odd == even){
            return odd;
        }
        for(int i = 1; i <= min/2 ; i++){
            if(odd%i == 0  && even%i == 0){
                ans = i;
            }
        }
        return ans;
        
    }
}