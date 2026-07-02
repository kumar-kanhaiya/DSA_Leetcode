class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int srow = 0;
        int erow = matrix.length-1 ;
        int scoll = 0;
        int ecoll = matrix[0].length-1;
        while(srow <= erow && scoll <= ecoll){
            // first iterate with the coll
            for(int i = scoll ; i <=ecoll ; i++ ){
                ans.add(matrix[srow][i]);
            }
            // second ecoll to erow 
            for(int i = srow+1 ; i<=erow ; i++){
                ans.add(matrix[i][ecoll]);
            }
            // now third ecol +1 scoll
            for(int i = ecoll-1 ; i >= scoll ; i--){
                if(srow == erow){
                    break;
                }
                ans.add(matrix[erow][i]);
            }
            // now last one 
            for(int i = erow-1 ; i>= srow+1 ; i-- ){
                if(scoll == ecoll){
                    break;
                }
                ans.add(matrix[i][scoll]);
            }
            srow++;
            scoll++;
            erow--;
            ecoll --;


        }
        return ans;
        
    }
}