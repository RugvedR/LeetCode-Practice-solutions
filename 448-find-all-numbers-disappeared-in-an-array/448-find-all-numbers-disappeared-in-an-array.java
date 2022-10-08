class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int z=0; z<nums.length; z++){
            if(nums[z] != z+1){
                ans.add(z+1);
            }
        }
        return ans;
    }
    
    static void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}