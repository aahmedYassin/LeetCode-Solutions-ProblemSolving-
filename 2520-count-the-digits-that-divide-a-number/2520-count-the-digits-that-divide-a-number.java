class Solution {
  
    public int countDigits(int n) {
        int counter = 0;
        int number=n;

        while (n > 0) {

            int remainder = n % 10;
            if (number % remainder == 0) {
                counter++;
            }

            n = n / 10;
        }
        return counter;

    }

}