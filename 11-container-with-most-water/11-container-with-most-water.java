class Solution {
    public int maxArea(int [] arr){
        int start = 0;
        int end = arr.length-1;
        int maxWater = 0;

        while(start<end){
            int minValueOutOfTwo = Math.min(arr[start], arr[end]);
            int distance = end-start;

            maxWater = Math.max(maxWater, minValueOutOfTwo*distance);

            if(arr[start]<arr[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxWater;
    }
}