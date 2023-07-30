class Solution {
 
    public int numMatchingSubseq(String s, String[] words) {

        int result = 0;
        Map<String, Integer> uniqueWords = new TreeMap<>();
        for (int i = 0; i < words.length; i++) {

            if (uniqueWords.containsKey(words[i])) {

                uniqueWords.put(words[i], uniqueWords.get(words[i]) + 1);

            } else {
                uniqueWords.put(words[i], 1);
            }

        }

        for (Map.Entry<String, Integer> me
                : uniqueWords.entrySet()) {

               if(isSubsequence(me.getKey(),s)){
                
                    result+=me.getValue();
                     
                }
        }

        return result;
    }

    public boolean isSubsequence(String s, String t) {

        boolean flag = false;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {

                i++;
            }
            j++;
        }

        if (i == s.length()) {
            flag = true;
        }

        return flag;
    }
}