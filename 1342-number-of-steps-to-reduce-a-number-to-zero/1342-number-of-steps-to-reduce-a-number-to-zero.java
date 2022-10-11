class Solution {
    public int numberOfSteps(int n) {
        int count=0;
        if(n==0) return 0;
        else if(n%2==0){
            count = numberOfSteps(n/2)+1;  
        } 
        else{
            count = numberOfSteps(n-1)+1;
        } 
        return count;
    }
}