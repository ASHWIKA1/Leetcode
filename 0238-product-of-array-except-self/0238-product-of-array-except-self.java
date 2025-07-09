class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        int a=1,b=1;
        for(int i=0;i<n;i++){
            res[i]=a;
            a*=nums[i];
        }
        for(int i=n-1;i>=0;i--){
            res[i]*=b;
            b*=nums[i];
        }
        return res;
    }
}
