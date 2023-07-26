class Solution {
 
    public String addStrings(String num1, String num2) {

        String paddingZeros = "", sum = "";
        int carry = 0;
        if (num1.length() > num2.length()) {
            for (int i = 0; i < num1.length() - num2.length(); i++) {
                paddingZeros += "0";
            }
            num2 = paddingZeros + num2;

        } else if (num2.length() > num1.length()) {
            for (int i = 0; i < num2.length() - num1.length(); i++) {
                paddingZeros += "0";
            }
            num1 = paddingZeros + num1;

        }

        for (int i = num2.length() - 1; i >= 0; i--) {

            if (Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i))) + carry > 9) {

                sum += (Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i))) + carry) % 10;
                carry = 1;
            } else {
                
                sum += Integer.parseInt(String.valueOf(num1.charAt(i))) + Integer.parseInt(String.valueOf(num2.charAt(i))) + carry;
                carry = 0;
            }

        }
        if (carry != 0) {
            sum =  sum+carry;
        }
      

        return new StringBuilder(sum).reverse().toString();

    }

}