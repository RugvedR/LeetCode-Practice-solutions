class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ansList = new ArrayList<>();
        
        for(int i=0; i<matrix.length; i++){
            int smallest = matrix[i][0];
            int smallIndex = 0;
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]<smallest){
                    smallest = matrix[i][j];
                    smallIndex = j;
                }
            }
            boolean isMax=true;
            for(int index=0; index<matrix.length; index++){
                if(smallest < matrix[index][smallIndex]){
                    isMax=false;
                    break;
                }
            }
            if(isMax){
                ansList.add(smallest);
            }
            
            
        }
        
        
        return ansList;
    }
}