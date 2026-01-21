class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();
        int major=nums.length/3;
       

        for (int num : nums) {
            h1.put(num, h1.getOrDefault(num, 0) + 1);
        }
        for(int key :h1.keySet())
        {
            if(h1.get(key)>nums.length/3){
                result.add(key);
            }
        }
        
        return result;
    }
}