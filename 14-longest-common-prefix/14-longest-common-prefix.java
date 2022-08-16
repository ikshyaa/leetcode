
import java.lang.*; 

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = "";
        String first = strs[0];
        boolean stillEq = true;
        
        for(int i = 0; i< first.length(); i++) {
            
            char letter = first.charAt(i);

            
            for(int j=1; j< strs.length; j++) {
                if(i>= strs[j].length() || strs[j].charAt(i) != letter) {
                    stillEq = false;
                    break; 
                }
            }
            
            if(stillEq) common = common + first.charAt(i);
            else break;
            
        }
        return common;
        
    }
}