class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        for(int i = 0; i < matrix.length; i++){

            int first = 0 ;
            int last = matrix[i].length-1;
            int mid = (first+last)/2;

            if(matrix[i][last] >= target){
                while(first <= last){
                    if(matrix[i][mid] < target){
                        first = mid+1;
                    }else if( matrix[i][mid] == target){
                        return true;
                    }else{
                        last = mid-1;
                    }
                    mid = (first+last)/2;
                }
            }
        }
        
        return false;
    }
}