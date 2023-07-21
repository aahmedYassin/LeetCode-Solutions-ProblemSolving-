class Solution {
     public String longestCommonPrefix(String[] strs) {
        String longestCommonPrefix = "";
        String temp = "";
        int counter = 0;
        if (strs.length == 1) {
            return strs[0];
        }
        for (int i = 0; i < strs[0].length(); i++) {

            temp += strs[0].charAt(i);
            counter = 0;

            for (int j = 1; j < strs.length; j++) {

                if (strs[j].contains(temp) && strs[j].indexOf(temp)
                        == 0) {
                    counter++;

                }
            }
            if (counter == strs.length - 1) {

                if (temp.length() > longestCommonPrefix.length()) {
                    longestCommonPrefix = temp;
                }

            }

        }

        return longestCommonPrefix;
    }
}