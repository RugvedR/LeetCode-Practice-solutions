class Solution {
    public int arrangeCoins(int n) {
        long start = 1;
        long end = (long)n;
        
        if(n==1) return 1;
        
        while(start <= end){
            long mid = start + (end-start)/2;
            
            if(mid*(mid+1)/2 == n) return (int)mid;
            else if(mid*(mid+1)/2 < n) start=mid+1;
            else{
                end = mid -1;
            }
        }
        
        return (int)end;
    }
}