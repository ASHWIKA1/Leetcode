class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int mx=Integer.MIN_VALUE;
        int j=0;

        while(j<nums.length){
            sum+=nums[j];
           mx=Math.max(mx,sum);
           
            if(sum<0 ){
                sum=0;
                 
            }
            j++;
            
        }
        return mx;
    }
}