class Solution {
   public boolean rotateString(String s, String goal) {
        boolean flag = false;
        String temp = "";

        for (int i = 0; i < goal.length(); i++) {

            temp += goal.substring(i);

            temp += goal.substring(0, i);

            if (temp.equals(s)) {
                return true;
            } else {
                temp = "";
            }

        }

        return flag;
    }

}