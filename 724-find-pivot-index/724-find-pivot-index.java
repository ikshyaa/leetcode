class Solution {
    public int pivotIndex(int[] nums) { //length 6
        
        int leftSum = 0;
        
        for(int i = 0; i <nums.length; i++ ) {
            int rightSum = 0;
            for(int j = nums.length-1; j>i; j-- ) {
                rightSum += nums[j];
            }
            if(leftSum ==rightSum) return i;
            leftSum += nums[i]; 
        }
        return -1;
        
        
//         for(int i=0; i< nums.length; i++) {
//             // 1,2
//             // false,false,
//             if(i >= nums.length -i) return -1;
//             // 2,,3
//             pivotI = i;
//             // 8, 11
            
//             // 6, 11
//             rightSum += nums[nums.length-(i+1)];
//             //false, true
//             if(leftSum == rightSum) {
//                 //3 = 3 true
//                if(pivotI ==nums.length-pivotI) return pivotI;
//             }
//             leftSum += nums[i];
//         }
//         return -1;
    }
}