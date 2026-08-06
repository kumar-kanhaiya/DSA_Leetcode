class Solution {
    public int smallestNumber(int n, int t) {

        // base condition 
        if(isDevided(n,t)){
            return n;
        }

        return smallestNumber(n+1 , t);
        
    }
    public static boolean isDevided(int n , int t){
        int ans = 1;
        while(n>0){
            int rem = n%10;
            ans *= rem;
            n /=10;
        }
        return (ans%t == 0);
    }
}