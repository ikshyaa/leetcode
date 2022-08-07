class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        int Sum= 0;
        for(int i=0; i< nums.length; i++) {
            Sum += nums[i];
            runningSum[i] =Sum;
        }
        return runningSum;
    }
}