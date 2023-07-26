class Solution {
   public String reverseStr(String s, int k) {
        String str = "";
        int start = 0;
        int end = 2 * k;

        while (end <= s.length()) {
            String temp = s.substring(start, end);
            start = start + (2 * k);
            end = 2*k+ end;
            str += new StringBuilder(temp.substring(0, k)).reverse().toString() + temp.substring(k);
        }

        if (k <= s.substring(start).length() && s.substring(start).length() < 2 * k) {

           str += new StringBuilder(s.substring(start).substring(0, k)).reverse().toString() + s.substring(start).substring(k);
       }
        if (s.substring(start).length() < k) {

            str += new StringBuilder(s.substring(start)).reverse().toString();
        }
        return str;
    }
}