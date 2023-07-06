class Solution {
   
    public boolean isValid(String s) {

        Stack<Character> Parentheses = new Stack<>();
        boolean flag = false;
        char c;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                Parentheses.push(s.charAt(i));
            } else if (Parentheses.size() == 0 && (s.charAt(i) == ']' || s.charAt(i) == '}' || s.charAt(i) == ')')) {
                flag = false;
                break;

            } else {

                c = Parentheses.pop();
                flag = checkOpenAndCloseValidity(c, s.charAt(i));
                if (flag) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
        }
        if(Parentheses.size()!=0)
             flag=false;

        return flag;
    }
    boolean checkOpenAndCloseValidity(char open, char close) {

        boolean flag = false;

        if (open == '[' && close == ']') {
            flag = true;
        } else if (open == '{' && close == '}') {
            flag = true;
        } else if (open == '(' && close == ')') {
            flag = true;
        }

        return flag;

    }
}