class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = Integer.MAX_VALUE;
        boolean check = true;
        for(int num : nums1){
            min = Math.min(num , min);
            if(num%2 ==1){
                check = false;
            }
        }
        return check || min%2 == 1;
        
    }
}