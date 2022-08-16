class Solution {
    public boolean containsDuplicate(int[] nums) {

        // for(int i = 0; i < nums.length; i++) {
        //     for(int j = i+1; j < nums.length; j++) {
        //         if(nums[i] == nums [j]) return true;
        //     }
        // }
        // return false; 
        
      Set<Integer> set = new HashSet();
        for(int i: nums) {
            if(set.contains(i)) return true;
            else set.add(i);
        }
        return false; 
        
        
        
        
        
    }
}