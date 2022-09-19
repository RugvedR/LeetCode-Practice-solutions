class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
        
//         ArrayList<Integer> ansList = new ArrayList<>();
        
//         for(int ele: nums){
//             if(ansList.contains(ele)){
//                 return true;
//             }
//             else{
//                 ansList.add(ele);
//             }
//         }
//         return false;
        
        
    }
}