class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<(col+1)/2; j++){
                swap(arr[i], j, col-j-1);
            }
        }

        //invert
        for(int i=0; i<row;i++){
            for(int j=0; j<col; j++){
                arr[i][j] = arr[i][j]^1;
            }
        }
        return arr;
    }

    static void swap(int[] arr, int item1, int item2){
        int temp = arr[item1];
        arr[item1] = arr[item2];
        arr[item2] = temp;
    }
}