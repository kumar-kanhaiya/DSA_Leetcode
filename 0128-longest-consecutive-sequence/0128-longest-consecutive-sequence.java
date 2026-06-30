class Solution {
    public int longestConsecutive(int[] arr) {
        // Arrays.sort(arr);
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        // insert all element in the set 
        for( int num : arr){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1) ){
                int test = num;
                int check = 0;
                while(set.contains(test)){
                    check++;
                    test++;
                }
            ans = Math.max(ans , check);
            }
        }
        return ans;

    }
}