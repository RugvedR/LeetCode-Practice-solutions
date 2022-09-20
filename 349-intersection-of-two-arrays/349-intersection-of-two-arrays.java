class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        
        for(int ele1 : nums1){
            for(int ele2 : nums2){
                if(ele1 == ele2){
                    set.add(ele1);
                }
            }
        }
        
        int[] ans = new int[set.size()];
        int i=0;
        
        for(int elem: set){
            ans[i++] = elem;
        }
        
        return ans;
    }
}