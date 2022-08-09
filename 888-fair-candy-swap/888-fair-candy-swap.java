import java.util.*;
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        
        for(int i=0; i<bobSizes.length; i++){
            bobSum += bobSizes[i];
        }
        for(int i=0; i<aliceSizes.length; i++){
            aliceSum += aliceSizes[i];
        }
        
        int difference = (aliceSum - bobSum) /2;
        Arrays.sort(aliceSizes);

        
        for(int i: bobSizes){
            if(binarySearch(aliceSizes, difference+i)){
                return new int[]{difference+i,i};
            }
        }
        return null;
        
    }
    
    static boolean binarySearch(int[]arr, int target){
        int start=0;
        int end = arr.length-1;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            
             if(arr[mid] == target) return true;
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return false;
    }
}