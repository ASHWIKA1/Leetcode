class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
          
        }
        int i=0;
        
        int ds1=0;
        int ds2=0;
        int ds=0;
        while(i<nums.length){
            while(nums[i]>9){
            int res=nums[i]%10;
           
            ds1+=res;
        
            nums[i]=nums[i]/10;
            }
            if(nums[i]<=9){
                ds2+=nums[i];
                
            }
            i++;
           
        }
       ds=ds1+ds2;
        int diff=sum-ds;
        return diff;
    }
}