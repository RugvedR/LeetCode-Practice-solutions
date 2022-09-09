class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ansList = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            ansList.add(index[i], nums[i]);
        }
        
        int[] ans = new int[ansList.size()];
        for(int j=0; j< ans.length; j++){
            ans[j] = ansList.get(j);
        }
        return ans;
    }
}