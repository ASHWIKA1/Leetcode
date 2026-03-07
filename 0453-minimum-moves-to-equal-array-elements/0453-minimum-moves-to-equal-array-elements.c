int minMoves(int* nums, int numsSize) {
    int max=nums[0];
    int sum=0;
    int res=0;
    for(int i=0;i<numsSize;i++){
        //minimum
        if(nums[i]<max){
            max=nums[i];
        }
        sum+=nums[i];
    }
    res=sum-(max*numsSize);
    return  res;

}