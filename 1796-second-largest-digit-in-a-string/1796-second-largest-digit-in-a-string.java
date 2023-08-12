
class Solution {

    public int secondHighest(String s) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                if (!numbers.contains(Integer.parseInt(s.charAt(i) + ""))) {
                    numbers.add(Integer.parseInt(s.charAt(i) + ""));
                }

            }

        }
        Collections.sort(numbers,Collections.reverseOrder());
        if (numbers.size() >= 2) {
            return numbers.get(1);

        }
        return -1;
    }
}