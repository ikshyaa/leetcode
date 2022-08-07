class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int sum = nums[0];
        int maxSum = nums[0]; 
        for(int i=1; i< nums.length; i++) {
            if(nums[i] >= (sum + nums[i])) {
                sum = nums[i];
                
            } else sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
        
    }
}