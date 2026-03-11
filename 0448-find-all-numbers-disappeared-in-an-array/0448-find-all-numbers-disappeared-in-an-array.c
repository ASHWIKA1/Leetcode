/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize){
    int *res;
 res = (int*) malloc(numsSize * sizeof(int)); 
 
 
 int j = 0;

 
    for(int i = 0; i < numsSize; i++){
        int index = abs(nums[i]) - 1;

        if(nums[index] > 0){
            nums[index] = -nums[index];
        }
    }

    // collect missing numbers
    for(int i = 0; i < numsSize; i++){
        if(nums[i] > 0){
            res[j++] = i + 1;
        }
    }
    *returnSize = j;
    return res;

}