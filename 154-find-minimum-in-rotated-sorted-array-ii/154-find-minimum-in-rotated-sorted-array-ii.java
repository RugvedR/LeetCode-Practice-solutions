class Solution {
    public int findMin(int[] arr){
        int pivot = findPivotwithduplicate(arr);
        if(pivot==-1){
            return arr[0];
        }
        else{
            return arr[pivot+1];
        }
    }

    static int findPivotwithduplicate(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start) / 2;

            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            //if elements at mid,start,end are equal then just skip the duplicates

            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skiip the duplicates by doing s++ and e--
                //but also check if start is pivot
                if(start<end && arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check if end is pivot
                if(end>start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            //left part is sorted, now pivot must be in right side
            else if(arr[mid]>arr[start] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}