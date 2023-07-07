class Solution {
      public int lengthOfLongestSubstring(String s) {

        Set<Character> uniqueCharacters = new HashSet<>();

        int length = 0, start = 0, end = 0;

        while (start < s.length() && end < s.length()) {

            if (uniqueCharacters.add(s.charAt(end))) {

                end++;
                if (end - start > length) {
                    length = end - start;
                }

            } else {

                uniqueCharacters.remove(s.charAt(start));
                start++;

            }

        }

        return length;
    }
}