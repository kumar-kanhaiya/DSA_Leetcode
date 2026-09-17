class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 0 ; i < strs.length ; i++){
            while(!strs[i].startsWith(prefix)){
                prefix = prefix.substring(0 , prefix.length() - 1);

                if(prefix.isEmpty()){
                    return "";
                }
            }
        }
        return prefix;
    }
    // public static int minimumIndex(String[] arr){
    //     int min = Integer.MAX_VALUE;
    //     for(int i =0 ; i < arr.length ; i++){
    //         min = Math.min(min , arr[i].length());
    //     }
    //     return min;
    // }
}