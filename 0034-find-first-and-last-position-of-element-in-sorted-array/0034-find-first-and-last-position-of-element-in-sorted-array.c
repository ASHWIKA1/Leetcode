/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {

    int* index = (int*)malloc(2 * sizeof(int));
    index[0] = -1;
    index[1] = -1;

    for(int i = 0; i < numsSize; i++){
        if(nums[i] == target){
            if(index[0] == -1){
                index[0] = i;
            }
            index[1] = i;
        }
    }

    *returnSize = 2;
    return index;
}