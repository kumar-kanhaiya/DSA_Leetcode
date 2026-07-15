class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        // now we use two pointer approach 
        int first = 0;
        int index = 0;
        int second = 0;
        while(first < m && second < nums2.length){
            if(nums1[first] < nums2[second]){
                ans[index++] = nums1[first];
                first++;
            }
            else{
                ans[index++] = nums2[second];
                second++;
            }
        }
        // now we have to check the both array 
        while(first < m ){
            ans[index++] = nums1[first];
            first++;
        }
        while(second < nums2.length){
            ans[index++] = nums2[second];
            second++;
        }

        // copy the ans into nums 1;
        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = ans[i];
        }
    }
}