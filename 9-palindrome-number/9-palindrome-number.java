class Solution {
    public boolean isPalindrome(int x) {
        
        if(x==0) return true;
        if(x<0 || x %10 == 0) return false; 
        
        
        int reverse = 0;
        // int num = x; 
        
        while(x > reverse) {
            reverse =reverse * 10 + x % 10;
            x = x/10;
        }
        if(reverse == x || x == reverse/10) return true;
        else return false;
        
        
    }
}