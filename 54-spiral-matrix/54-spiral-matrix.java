class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int distFromWall = 0;
        int i=0;
        int j=0;
        List<Integer> ansList = new ArrayList<>();

        while(ansList.size() != (row*col)){
            //right direction
            while(j<col-distFromWall && ansList.size() != (row*col)){
                ansList.add(arr[i][j++]);
            }
            j--;
            i++;

            //down direction
            while(i<row-distFromWall && ansList.size() != (row*col)){
                ansList.add(arr[i++][j]);
            }
            i--;
            j--;

            //left direction
            while(j>=distFromWall && ansList.size() != (row*col)){
                ansList.add(arr[i][j--]);
            }
            j++;
            i--;

            //up direction
            while(i>distFromWall && ansList.size() != (row*col)){
                ansList.add(arr[i--][j]);
            }
            i++;
            j++;
            distFromWall++;


        }
        return ansList;

    }
}