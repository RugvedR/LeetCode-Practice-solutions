class Solution {
    public int searchInsert(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int insertPosition = 0;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            if(target > arr[mid]){
                start = mid +1;
            }
            if(target==arr[mid]){
                return mid;
            }
            insertPosition = mid;
            
        }
        if(target > arr[insertPosition]){
            return insertPosition+1;
        }
        else{
            return insertPosition;
        }
    }
}