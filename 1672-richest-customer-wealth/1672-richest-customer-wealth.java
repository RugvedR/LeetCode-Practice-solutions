class Solution {
    public int maximumWealth(int[][] accounts) {
        int row = accounts.length;
        int maxWealth = 0;
        for(int i=0; i<row; i++){
            int max = 0;
            for(int j=0; j<accounts[i].length; j++){
                max = max+accounts[i][j];
            }
            if(max>maxWealth){
                maxWealth=max;
            }
        }
        return maxWealth;
    }
}