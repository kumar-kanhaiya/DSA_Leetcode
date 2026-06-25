class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        long ans = 0;
        for(int i = 0 ; i< arr.length ; i++){
            long count = 0 ;
            if(arr[i] == 1){
                int j = i;
                while(j< arr.length  && arr[j] == 1){
                    count++;
                    j++;
                }
                i = j;
            }
            ans = Math.max(count , ans);
        }
        return (int)ans;
    }
}