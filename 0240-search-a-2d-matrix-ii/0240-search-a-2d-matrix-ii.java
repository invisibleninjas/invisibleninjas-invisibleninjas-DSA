class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row =0,col =matrix[0].length-1;
        while(col>=0 && row<=matrix.length-1){
            if(target == matrix[row][col]){
                return true;
            }
            else if(target < matrix[row][col]){
                col--;
            }
            else if(target > matrix[row][col]){
                row++;
            }
        }
        return false;
        
    }
}