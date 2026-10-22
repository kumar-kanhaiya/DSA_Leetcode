class Solution {
    public int beautySum(String s) {
        int ans = 0;
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            int[] freq = new int[26];
            int max = 0;
            for(int j = i ; j < n ; j++){
                int index = s.charAt(j) - 'a';
                freq[index]++;
                max = Math.max(max , freq[index]);
                int min = Integer.MAX_VALUE;
                for(int k = 0 ; k < 26 ; k++){
                    if (freq[k] > 0) {
                        min = Math.min(min, freq[k]);
                    }
                }
                ans += (max - min);
            }
        }
        return ans;
    }
    // public static int SumCalculate(String s){
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     if(s.length() <= 2){
    //         return 0;
    //     }
    //     for(int i = 0 ; i< s.length() ; i++){
    //         map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0) + 1);
    //     }
    //     int max = 0;
    //     int min = Integer.MAX_VALUE;;
    //     for(int i = 0 ; i< s.length() ; i++){
    //         // map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0) + 1);
    //         max = Math.max(max , map.get(s.charAt(i)));
    //         min = Math.min(min , map.get(s.charAt(i)));
    //     }
    //     return max - min;
    // }
}