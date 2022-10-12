class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> templist = new ArrayList<>();
        backtrack(list, templist, nums, target, 0);
        return list;
    }
    static void backtrack(List<List<Integer>> list, List<Integer> templist, int[] nums, int rem, int index){
        if(rem<0 || index == nums.length){
            return;
        }
        if(rem==0){
            list.add(new ArrayList<Integer>(templist));
            return;
        }
        if(rem>0){
            templist.add(nums[index]);
            backtrack(list, templist, nums, rem-nums[index], index);
            templist.remove(templist.size()-1);
        }
        backtrack(list, templist,nums, rem, index+1);
    }
}