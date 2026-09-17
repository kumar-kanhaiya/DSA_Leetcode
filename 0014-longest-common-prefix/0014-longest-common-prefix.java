class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int len = minimumIndex(strs);
        for(int i = 0 ; i < len ; i++ ){
            char ch = strs[0].charAt(i);
            boolean check = true;
            int j = 1;
            while(j< strs.length){
                if(strs[j].charAt(i) != ch){
                    check = false;
                }
                j++;
                
            }
            if(check == false){
                break;
            }
            else{
                ans += ch;
            }
        }
        return ans;
    }
    public static int minimumIndex(String[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0 ; i < arr.length ; i++){
            min = Math.min(min , arr[i].length());
        }
        return min;
    }
}