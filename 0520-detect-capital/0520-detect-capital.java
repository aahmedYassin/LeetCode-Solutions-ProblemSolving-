class Solution {
   public boolean detectCapitalUse(String word) {
        
        return isCapital(word) || isLower(word) || isFirstLetterCapital(word);
    }
    
    boolean isCapital(String word) {
        
        boolean flag = false;
        for (char c : word.toCharArray()) {
            
            if (Character.isUpperCase(c)) {
                flag = true;
            } else {
                return false;
            }
        }
        
        return flag;
    }
    
    boolean isLower(String word) {
        
        boolean flag = false;
        for (char c : word.toCharArray()) {
            
            if (Character.isLowerCase(c)) {
                flag = true;
            } else {
                return false;
            }
        }
        
        return flag;
    }
    
    boolean isFirstLetterCapital(String word) {
        
        boolean flag = false;
        
        for (int i = 0; i < word.toCharArray().length; i++) {
            
            if (i == 0) {
                
                if (Character.isUpperCase(word.toCharArray()[i])) {
                    
                    flag = true;
                } else {
                    return false;
                }
            } else {
                
                if (Character.isLowerCase(word.toCharArray()[i])) {
                    
                    flag = true;
                } else {
                    return false;
                }
            }
            
        }
        
        return flag;
    }
}