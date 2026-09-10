class Solution {
    public long countCommas(long n) {
        if(n<=999){
            return 0;
        }
        long count = 0;
        long power = 1000;
        while(power <= n){
            count += n - power + 1;
            power = power * 1000;
        }
        return count;
        
    }
}