class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double cavg=0;
        double mavg;
        for(int i=0;i<k;i++){
            cavg+=nums[i];
        }
        mavg=cavg;
        cavg=cavg-nums[0];


        for(int i=k;i<n;i++){
            cavg=cavg+nums[i];
            if(cavg>mavg){
                mavg=cavg;
               
            }
             cavg=cavg-nums[i-k+1];

        }
        return mavg/k;
    }
}