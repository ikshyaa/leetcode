class Solution {
    public int trailingZeroes(int n) {
        int trail = 0;
//         for(int i = 5; i<=n; i*=5) {
//             trail = trail + n/i;
            
//         }
//         return trail;
        
        int temp = 5;
        int x= n;
        
        while(temp <= n ) {
            trail = trail + n / temp;
            temp *= 5;
        }
        return trail;
        
    }
}