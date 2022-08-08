class Solution {
    public void reverseString(char[] s) {
        
        
        int endI = s.length -1;
        int midPoint = s.length/2; 
        
        for(int i = 0; i < midPoint ; i++) {
            char temp = s[i];
            s[i] = s[endI -i];
            s[endI - i] = temp;
            
        }

    }
}