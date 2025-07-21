class Solution {
    public boolean canAliceWin(int[] nums) {
        int ss=0;
        int ds=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]<=9){
            ss+=nums[i];
        }
        
        else{
            ds+=nums[i];
        }
        }
        if(ss==ds){
            return false;
        }
        else{
            return true;
        }
    
    }
}