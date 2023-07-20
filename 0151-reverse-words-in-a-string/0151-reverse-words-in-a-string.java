class Solution {
   
        public String reverseWords(String s) {

        String words[] = s.trim().split(" ");
        String str = "";
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != "") {
                str += words[i] + " ";
            }
        }
        str = str.trim();
        return str;

    }
}