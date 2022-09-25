class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]%2==1 && nums[j]%2==0){
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }
    
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}