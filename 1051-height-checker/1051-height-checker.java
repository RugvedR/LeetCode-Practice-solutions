class Solution {
    public int heightChecker(int[] heights) {
        int[] sorted = new int[heights.length];
        int z=0;
        for(int ele: heights){
            sorted[z++] = ele;
        }
        
        Arrays.sort(sorted);
        
        int count=0;
        
        for(int i=0; i<heights.length; i++){
            if(heights[i]!=sorted[i]){
                count++;
            }
        }
        return count;
    }
}