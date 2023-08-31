
class Solution {
    public boolean validPalindrome(String s) {
        boolean flag = false;
        int i = 0, j = s.length() - 1;
         if (s.length() == 2)
            return true;
        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {

                flag = true;

            } else {
                return isPalindrome(s.substring(0, i) + s.substring(i + 1)) || isPalindrome(s.substring(0, j) + s.substring(j + 1));
            }

            i++;
            j--;
        }
        return flag;
    }

    public boolean isPalindrome(String s) {
        boolean flag = false;
        int i = 0, j = s.length() - 1;
        while (i < j) {

            if (s.charAt(i) == s.charAt(j)) {

                flag = true;

            } else
                return false;

            i++;
            j--;
        }

        return flag;

    }
}