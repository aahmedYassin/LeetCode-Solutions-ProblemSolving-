class Solution {
     public String addBinary(String a, String b) {

        String sum = "";
        String carry = "0";
        if (b.length() < a.length()) {
            String padding = "";
            for (int i = 0; i < a.length() - b.length(); i++) {
                padding += "0";
            }
            b = padding + b;
        } else if (b.length() > a.length()) {
            String padding = "";
            for (int i = 0; i < b.length() - a.length(); i++) {
                padding += "0";
            }
            a = padding + a;
        }

        for (int i = a.length() - 1; i >= 0; i--) {

            if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                if (carry == "0") {
                    sum += "0";
                } else if (carry == "1") {
                    sum += "1";
                    carry = "0";

                }

            } else if (a.charAt(i) == '0' && b.charAt(i) == '1') {
                if (carry == "0") {
                    sum += "1";
                } else if (carry == "1") {
                    sum += "0";
                    carry = "1";

                }

            } else if (a.charAt(i) == '1' && b.charAt(i) == '0') {
                if (carry == "0") {
                    sum += "1";
                } else if (carry == "1") {
                    sum += "0";
                    carry = "1";

                }

            } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                if (carry == "0") {
                    sum += "0";
                    carry = "1";
                } else if (carry == "1") {
                    sum += "1";
                    carry = "1";

                }
            }

        }
        if (carry == "1") {
            sum += "1";
        }
        return new StringBuilder(sum).reverse().toString();

    }
}