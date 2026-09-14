class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length ;
        int n = nums2.length ;
        int[] ans = new int[m+n];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i< m && j< n){
            if(nums1[i] > nums2[j]){
                ans[index] = nums2[j];
                j++;
                index++;
            }
            else{
                ans[index] = nums1[i];
                i++;
                index++;
            }
        }
        // if the element of i present 
        while(i < m){
            ans[index++] = nums1[i++];
        }
        // if the element of j present 
        while(j < n){
            ans[index++] = nums2[j++];
        }
        // now we have the merge array 
        // first we have to find it is odd or even 
        if(ans.length%2 != 0){
            int indexAns = ans.length/2;
            return (double)ans[indexAns];
        }
        
            int indexAns = ans.length/2;
            double finalAns = (double)(ans[indexAns] + ans[indexAns-1])/2;
            return finalAns;
        
        
    }
}