class Solution {
   
    public String reverseVowels(String s) {

        if (s.length() == 0) {
            return "";
        }
        int index = 0;
        StringBuilder strBuild = new StringBuilder(s);
        List<Character> vowels = new ArrayList<>();

        for (int i = strBuild.length() - 1; i >= 0; i--) {

            if (isVowel(s.charAt(i))) {
                vowels.add(s.charAt(i));
                strBuild.replace(i, i + 1, "*");
            }

        }

        for (int i = 0; i < strBuild.length(); i++) {

            if (strBuild.charAt(i) == '*'&&index<vowels.size()) {

                strBuild.replace(i, i + 1, vowels.get(index).toString());
                index++;

            }

        }
        return strBuild.toString();
    }

    boolean isVowel(char c) {

        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        } else {
            return false;
        }

    }

}