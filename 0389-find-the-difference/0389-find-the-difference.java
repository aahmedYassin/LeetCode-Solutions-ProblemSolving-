class Solution {
     public char findTheDifference(String s, String t) {

        char c = '0';
        StringBuilder maxLength = s.length() > t.length() ? new StringBuilder(s) : new StringBuilder(t);
        StringBuilder minLength = s.length() < t.length() ? new StringBuilder(s) : new StringBuilder(t);
        for (int i = 0; i < maxLength.length(); i++) {

            if (minLength.indexOf(maxLength.charAt(i) + "") == -1) {
                c = maxLength.charAt(i);
                break;
            } else {

                int index = minLength.indexOf(maxLength.charAt(i) + "");
                minLength = minLength.deleteCharAt(index);

            }
        }

        return c;

    }
}