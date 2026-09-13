class Solution {
    public int totalNumbers(int[] arr) {
        int[] freq = new int[10];
        for(int i = 0 ; i < arr.length ; i++){
            freq[arr[i]]++;
        }
        int ans = 0;
        for(int i = 100 ;i <= 999 ; i++){
            if(i%2 != 0){
                continue;
            }
            int n = i;
            int a = n%10 ;
            n /= 10;
            int b = n%10;
            n /= 10;
            int c = n%10;
            n /= 10;
            int[] check = new int[10];
            check[a]++;
            check[b]++;
            check[c]++;
            boolean toto = true;
            for(int d = 0 ; d <= 9 ; d++){
                if(check[d] > freq[d]){
                    toto = false;
                    break;
                }
            }
            if(toto){
                ans++;
            }
        }
        return ans;
        
    }
}