class Solution {
    public int[] plusOne(int[] digits) {

        int result[] = null;
        String temp = "";
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] + carry == 10) {

                temp += "0";
                carry = 1;
            } else {
                temp += (digits[i] + carry);
                carry = 0;
            }

        }
        if (carry == 1) {
            temp += "1";
        }

        result = new int[temp.length()];
        int i = 0, j = temp.length() - 1;
        while (i < result.length) {

            result[i] = Integer.parseInt(temp.charAt(j) + "");
            i++;
            j--;
        }

        return result;
    }
}