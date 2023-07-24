class Solution {
   public int firstUniqChar(String s) {

        int index = 0, min = 0;
        Map<Character, Integer> characters = new HashMap<>();
        List<Integer> occurence = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {

            if (characters.containsKey(s.charAt(i))) {
                characters.put(s.charAt(i), characters.get(s.charAt(i)) + 1);
            } else {
                characters.put(s.charAt(i), 1);

            }

        }

        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {

            if (entry.getValue() == 1) {
                occurence.add(s.indexOf(entry.getKey()));
            }

        }

        if (occurence.size() != 0) {
            min = occurence.get(0);

        } else {
            return -1;
        }

        for (int i = 1; i < occurence.size(); i++) {
            if (occurence.get(i) < min) {
                min = occurence.get(i);
            }
        }

        return min;

    }
}