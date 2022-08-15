class Solution {
    public int reachNumber(int target) {
        int currentSum = 0;
        int i=0;
        target = Math.abs(target);
        while(currentSum<target || (currentSum-target)%2 != 0){
            i++;
            currentSum+=i;
        }
        return i;
    }
}