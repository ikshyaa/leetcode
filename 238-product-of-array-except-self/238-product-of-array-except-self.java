class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        // int[] product = new int[nums.length];
        
        // for(int i=0; i< nums.length; i++) {
        //     product[i] = 1; 
        //     for(int j = 0; j< nums.length; j++){
        //         if(i!=j) {
        //          product[i] = product[i] * nums[j];
        //         }
        //     }
        // }
        // return product;
        
        int[] pp = new int[nums.length];
        pp[0] = 1;
        int temp = 1; 
        
        for(int i=0; i< nums.length; i++) {
            if(i+1 < nums.length) {
                pp[i+1] = pp[i] * nums[i];
            }
        }
        
        for(int i = nums.length-1; i >= 0; i-- ) {
            pp[i] = pp[i] * temp; 
            temp = temp * nums[i]; 
        }
        return pp;
        
        
    }
}