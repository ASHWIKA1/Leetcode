/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int compare(const void *a, const void *b) {
    return (*(int*)a - *(int*)b);
}
int* relativeSortArray(int* arr1, int arr1Size, int* arr2, int arr2Size, int* returnSize) {

    qsort(arr1, arr1Size, sizeof(int), compare);
    int* res = (int*)malloc(arr1Size * sizeof(int));
    
    int k=0;

      for(int i=0;i<arr2Size;i++){
        for(int j=0;j<arr1Size;j++){
if(arr2[i]==arr1[j]){
            res[k++]=arr1[j];
            arr1[j]=-1;
        }
        }
      }
        
    

for(int s=0;s<arr1Size;s++){
    if(arr1[s]!=-1){
    res[k++]=arr1[s];
    }
}
 *returnSize = arr1Size;
return res;
}
