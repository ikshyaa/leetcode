class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length == 1) return nums[0];
        
        
        int n= nums.length;

        int maxProduct = nums[0];
        
        for(int i= 0; i<n; i++) {
            int product = nums[i];
        
            for(int j =i+1; j< n; j++) {
                
                maxProduct = Math.max(maxProduct, product);
                
                product = product * nums[j];
                
            }
            maxProduct = Math.max(maxProduct, product);
            
        }
        return maxProduct; 
    }
}