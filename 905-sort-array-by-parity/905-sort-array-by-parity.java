class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        while(start<end){
            if(nums[end]%2!=0){
                end--;
                continue;
            }
            if(nums[start]%2==0){
                start++;
                continue;
            }
            swap(nums, start, end);
            start++;
            end--;
        }
        
        return nums;
        
    }
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}