class Solution {
    public int findMin(int[] arr){
        int pivot = findPivot(arr);

        if(pivot==-1){
            return arr[0];
        }
        else{
            return arr[pivot+1];
        }
    }
    
    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            //those 4 cases here
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    
}