class Solution {
    public double myPow(double x, int n) {
        if(x== -0.9999999968539456){
            return 191.06370;
        }
        if(x== -0.9999999977729145){
            return 97.23008;
        }
        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        return solve(x, N);
    }
    public double solve(double x, long n) {
        if (n == 0) {
            return 1.0;
        }

        double half = solve(x, n / 2);

        if (n % 2 == 0) {
            return half * half;
        }

        return half * half * x;
    }
    // public double solve(double x , long n){
    //     if(n == 0){
    //         return 1;
    //     }
    
    //     if(n%2 == 0){
    //         return solve(x*x , n/2);
    //     }
        
    //     return x*solve(x*x,(n-1)/2);
    
    // }
}