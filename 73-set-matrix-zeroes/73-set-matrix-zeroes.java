class Solution {
    public void setZeroes(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;
        
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==0){
                    if(i==0) firstRowZero = true;
                    if(j==0) firstColZero = true;
                    
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }
        
        for(int i=1; i<row; i++){
            for(int j=1; j<col; j++){
                if(arr[i][0]==0 || arr[0][j]==0){
                    arr[i][j] = 0;
                }
            }
        }
        
        if(firstRowZero){
            for(int j=0; j<col; j++){
                arr[0][j] = 0;
            }
        }
        if(firstColZero){
            for(int i=0; i<row; i++){
                arr[i][0] = 0;
            }
        }
        
    }
}