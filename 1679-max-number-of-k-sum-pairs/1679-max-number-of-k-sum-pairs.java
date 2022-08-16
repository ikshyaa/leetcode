class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        
        int left = 0;
        int right = nums.length -1;
        int count = 0;
        while(left< right) {
            int sum = nums[left] +nums[right];
            if(sum == k) {
                left++;
                right --;
                count++;
            }
            if(sum <k) left ++;
            if(sum>k) right--;
        }
        return count;
        
        
        
        
//         int count = 0;
//         for(int i=0; i< nums.length; i++) {
//             for(int j=i+1; j< nums.length; j++ ) {
//                 if((nums[i] + nums[j]) == k) {
//                     count++;
//                 }
//             }
//         }
//         return count;
        
    }
}