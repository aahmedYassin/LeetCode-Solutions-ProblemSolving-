
class Solution {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> sCharcters = new Stack<>();
        Stack<Character> tCharcters = new Stack<>();
        int size = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '#') {

                sCharcters.push(s.charAt(i));
            } else if (!sCharcters.empty()) {
                sCharcters.pop();

            }
        }

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) != '#') {

                tCharcters.push(t.charAt(i));
            } else if (!tCharcters.empty()) {
                tCharcters.pop();

            }
        }
        s = "";
        t = "";
        size = sCharcters.size();
        for (int i = 0; i < size; i++) {

            s += sCharcters.pop();

        }
        size = tCharcters.size();
        for (int i = 0; i < size; i++) {

            t += tCharcters.pop();

        }

        return s.equals(t);

    }
}