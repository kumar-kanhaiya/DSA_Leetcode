class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        // first we have to apply sorting 
        Arrays.sort(intervals, (a, b) -> {
    if (a[0] != b[0]) {
        return Integer.compare(a[0], b[0]);   // Start ascending
    } else {
        return Integer.compare(b[1], a[1]);   // End descending
    }
});
        int max = intervals[0][1];
        // now we have to check if the next element is greater or not 
        int ans = intervals.length ;
        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][1] <= max){
                ans--;
            }
            else{
                max = intervals[i][1];
            }
        }
        return ans;
    }

}