class Solution {
   
  public boolean isPalindrome(String s) {
        boolean flag = false;
        String nonAlphanumericStr = "";
        s = s.toLowerCase();
        s = s.replace(" ", "");

        for (int i = 0; i < s.length(); i++) {

            if (((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) || ((int) s.charAt(i) >= 48 && (int) s.charAt(i) <= 57)) {

                nonAlphanumericStr += s.charAt(i);
            }
        }

        StringBuilder strReversed = new StringBuilder(nonAlphanumericStr).reverse();

        flag = nonAlphanumericStr.contentEquals(strReversed) ? true : false;

        return flag;
    }
}