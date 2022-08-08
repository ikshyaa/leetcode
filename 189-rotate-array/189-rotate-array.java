class Solution {
    public void rotate(int[] nums, int k) {
        k=k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length -1);
    }
    
    private void reverse(int[] num,int start,int end) {
        while(start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start ++;
            end --;
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
//         int[] arr = new int[nums.length];
//         int count =0;
//         while(count < k) {
//             arr[count] = nums[nums.length-(k-count)];
//             count++;
//         }
//         for(int i=0; i< nums.length -k; i++){
//             arr[count] = nums[i];
//             count++;
//         }
        
//         for(int i=0; i< nums.length; i++) {
//             System.out.println(arr[i]);
//         }
            
//         }
        
//     }
