class Solution {
 
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        boolean flag = false;
        Map<Character, Integer> firstStr = getCharactersCount(s);
        Map<Character, Integer> secondStr = getCharactersCount(t);

        for (Map.Entry<Character, Integer> entry : firstStr.entrySet()) {

            if (secondStr.containsKey(entry.getKey())) {

                if (firstStr.get(entry.getKey()).equals(secondStr.get(entry.getKey()))) {
                    flag = true;

                } else {
                    flag = false;
                    break;
                }
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public TreeMap<Character, Integer> getCharactersCount(String s) {
        TreeMap<Character, Integer> characters = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {

            if (characters.containsKey(s.charAt(i))) {

                characters.put(s.charAt(i), characters.get(s.charAt(i)) + 1);
            } else {

                characters.put(s.charAt(i), 1);

            }
        }
        return characters;

    }
}