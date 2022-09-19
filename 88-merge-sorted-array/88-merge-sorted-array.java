class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] ans = new int[m+n];
        int k = 0;
        int i=0;
        int j=0;
        while(i<m && j<n){
            if(nums1[i] <= nums2[j]){
                ans[k] = nums1[i];
                i++;
                k++;
            }
           
            else{
                ans[k] = nums2[j];
                j++;
                k++;
            }
            
        }
        
        while(i<m ){
            ans[k] = nums1[i];
            i++;
            k++;
        }
        
        while(j<n){
            ans[k] = nums2[j];
            j++;
            k++;
        }
        
        for(int z=0; z<m+n; z++){
            nums1[z] = ans[z];
        }
    }
}