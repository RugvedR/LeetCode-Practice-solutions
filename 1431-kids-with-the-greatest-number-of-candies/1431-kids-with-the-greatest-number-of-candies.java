class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // boolean [] ans = new boolean[candies.length];
        if(candies.length == 0){
            return new ArrayList<Boolean>();
        }
        ArrayList<Boolean> ans = new ArrayList<>(candies.length);
        for(int i=0; i< candies.length; i++){
            if(candies[i]+extraCandies >= maxEle(candies)){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }
        return ans;
    }
    
    static int maxEle(int [] arr){
        int max = arr[0];
        
        for(int i=1; i< arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
            
        return max;
    }
}