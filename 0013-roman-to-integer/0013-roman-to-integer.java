class Solution {
  
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumerals = new HashMap<>();

        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int sum = 0, i = 0;

        while (i < s.length()) {

            if (i == s.length() - 1) {
                sum += romanNumerals.get(s.charAt(i));
                i++;
            } else {
                if (romanNumerals.get(s.charAt(i)) >= romanNumerals.get(s.charAt(i + 1))) {
                    sum += romanNumerals.get(s.charAt(i));
                    i++;
                } else if (romanNumerals.get(s.charAt(i)) < romanNumerals.get(s.charAt(i + 1))) {
                    int x = (romanNumerals.get(s.charAt(i + 1)) - romanNumerals.get(s.charAt(i)));
                    sum += x;
                    i += 2;

                }
            }


        }

        return sum;
    }
}