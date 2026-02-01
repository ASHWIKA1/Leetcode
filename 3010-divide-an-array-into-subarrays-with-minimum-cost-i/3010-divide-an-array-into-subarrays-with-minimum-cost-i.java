class Solution {
    public int minimumCost(int[] nums) {
       
        int count=nums[0];
        int max=0;
    for(int i=0;i<nums.length;i++){
        
            if(max>nums[i]){
                max=nums[i];
            }
        
    }
        nums[0]=max;
         Arrays.sort(nums);
        for(int i=1;i<3;i++){
            
            count+=nums[i];
        }
        return count;
    }
}