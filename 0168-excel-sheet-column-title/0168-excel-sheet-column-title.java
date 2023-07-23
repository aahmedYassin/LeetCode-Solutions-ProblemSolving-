class Solution {
     public String convertToTitle(int columnNumber) {

        String letters[] = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        String title = "";

        while (columnNumber > 0) {

            columnNumber--;
            title += letters[columnNumber % 26];

            columnNumber /= 26;
        }
        return new StringBuilder(title).reverse().toString();
    }
}