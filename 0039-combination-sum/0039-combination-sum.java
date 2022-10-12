class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        backtrack(list, templist, nums, target, 0);
        return list;
    }
    static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int rem, int start){
        if(rem<0 )return;
        if(rem==0) list.add(new ArrayList<Integer>(templist));

        for(int i=start; i<nums.length; i++){
            templist.add(nums[i]);
            backtrack(list, templist, nums, rem-nums[i], i);
            templist.remove(templist.size()-1);
        }
    }
}