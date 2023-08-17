
class Solution {

    public int minLength(String s) {
        
        boolean flag = true;
        while (flag) {
            
            if (!s.contains("AB") && !s.contains("CD")) {
                break;
            } else {
                s = s.replace("AB", "");
                s = s.replace("CD", "");
            }
            
        }
        
        return s.length();
    }
}
