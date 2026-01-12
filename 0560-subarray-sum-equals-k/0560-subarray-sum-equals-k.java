class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> numtable = new HashMap<>();
        int psum=0;
         int posarray=0;
        numtable.put(0,1);
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
        
       
        int remove=psum-k;
        if(numtable.containsKey(remove))
            posarray+=numtable.get(remove);
        
     
        numtable.put(  psum, numtable.getOrDefault(psum, 0) + 1);
        }
    
 return posarray;
    }
    
   
}