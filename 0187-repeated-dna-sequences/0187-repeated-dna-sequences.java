class Solution {
      public List<String> findRepeatedDnaSequences(String s) {
        List<String> repatedDna = new ArrayList<>();
        Map<String, Integer> words = new TreeMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {

            String temp = s.substring(i, i + 10);
            if (words.containsKey(temp)) {
                words.put(temp, words.get(temp) + 1);

            } else {

                words.put(temp, 1);
            }

        }

        words.forEach((k, v) -> {

            if (v > 1) {
                repatedDna.add(k);
            }

        });

        return repatedDna;

    }
}