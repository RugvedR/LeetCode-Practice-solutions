class Solution {
    public int[] runningSum(int[] nums) {
        int[] runSum = new int[nums.length];
        int totalSum = 0;
        for(int i=0; i<nums.length; i++){
            totalSum += nums[i];
            runSum[i] = totalSum;
        }
        return runSum;
    }
}