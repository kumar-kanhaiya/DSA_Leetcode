class Solution {
    public void rotate(int[][] matrix) {
        int srow = 0;
        int erow = matrix.length ;
        // transpose the matrix
        while(srow < erow){
            // now swap the element 
            for(int i = srow ; i < erow ; i++){
                int temp = matrix[srow][i];
                matrix[srow][i] = matrix[i][srow];
                matrix[i][srow] = temp;
            }
            srow++;
        }
        // now reverse the row 
        srow = 0;
        while(srow < erow){
            for(int i = 0 ; i< erow/2; i++){
                int temp = matrix[srow][i];
                matrix[srow][i] = matrix[srow][erow - i - 1];
                matrix[srow][erow-i-1] = temp;
            }
            srow++;
        }
    }
    
}