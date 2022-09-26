class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squares = new int[nums.length];
        int i=0;
        for(int num: nums){
            squares[i++] = num*num;
        }
        Arrays.sort(squares);
        return squares;
    }
}