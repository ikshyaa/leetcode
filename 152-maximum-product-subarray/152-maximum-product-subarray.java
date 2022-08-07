class Solution {
    public int maxProduct(int[] nums) {
        
        if(nums.length ==1) return nums[0];
        
        int minProduct = nums[0];
        int maxProduct = nums[0];
        int result = nums[0];
        
        for(int i= 1; i<nums.length; i++) {
            if(nums[i] == 0) {
                minProduct =1;
                maxProduct =1;
            }
            
            int temp = maxProduct*nums[i];
            maxProduct = Math.max((Math.max(maxProduct * nums[i], minProduct * nums[i])), nums[i]);
            minProduct = Math.min((Math.min(temp, minProduct * nums[i])), nums[i]);
            
            result = Math.max(maxProduct, result);
        }
        return result;
    }
}

//             product = product * nums[i];
            
//             // if(product < nums[i]) product2 = nums[i];
            
//             product2 = Math.max(product, product2);
//             for(int j =i; j< nums.length; j++) {
//                 if(product2 < nums[j]) product2 = nums[i];
//                 else product2 *= nums[j];
//             }
//             maxProduct = Math.max(maxProduct, product);
            
//             maxProduct = Math.max(maxProduct, product2); 
//         }
//         return maxProduct; 
