class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
//         ArrayList<List<Integer>> list = new ArrayList<>();
//         ArrayList<Integer> triplets = new ArrayList<>();
        
//         int sum=0;
//         Arrays.sort(nums);
//         int a=0;
//         int b=0;
        
//         for(int i=0; i< nums.length - 2; i++){
//             if(i==0 || (i>0 && nums[i]!=nums[i-1])){
//                 a = i+1;
//                 b = nums.length-1;
                
//                 while(a<b){
//                     sum = nums[i] + nums[a] + nums[b];
//                     if(sum<=0)a++;
//                     if(sum>0)b--;
//                     if(sum==0){
//                         triplets.add(nums[i]);
//                         triplets.add(nums[a]);
//                         triplets.add(nums[b]);
//                         list.add(triplets);
//                         while(a<b && nums[a] == nums[a+1])a++;
//                         while(a<b && nums[b] == nums[b-1])b--;
//                     }
//                 }
//             }
//         }
//         return list;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> triplets = new ArrayList<Integer>();
        int sum = 0;
        
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                a = i + 1;
                b = nums.length - 1;
                while (a < b) {
                    sum = nums[i] + nums[a] + nums[b];
                    if (sum == 0) {
                        
                        list.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[a], nums[b])));
                        

                        while(a < b && nums[a] == nums[a + 1]) a++;
                        while(a < b && nums[b] == nums[b - 1]) b--;
                    }
                    if (sum <= 0) a++;
                    if (sum > 0) b--;
                }
            }
        }
        
        return list;
    }
}