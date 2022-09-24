class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n-1; i++){
            if(nums[i]!=nums[i+1]){
                list.add(nums[i]);
            }
        }
        list.add(nums[n-1]);
        
        if(list.size()<3){
            return list.get(list.size()-1);
        }
        else{
            return list.get(list.size()-3);
        }
    }
}