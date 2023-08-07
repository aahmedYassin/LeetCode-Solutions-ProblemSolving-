class Solution {
 public int countSegments(String s) {
        int counter = 0;
        if (s.length() == 0) {
            return 0;
        }
        for (String str : s.trim().split(" ")) {
            if (!str.equals("")) {
                counter++;
            }
        }

        return counter;
    }
}