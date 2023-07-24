class Solution {
     public int addDigits(int n) {
        int sum = 0;
        int counter = 0;
        if (n == 0) {
            return 0;
        }
        while (true) {

            while (n > 0) {

                int remainder = n % 10;
                sum += remainder;

                n = n / 10;
                counter++;
            }
            if (counter == 1) {
                return sum;
            }
            n = sum;
            sum = 0;
            counter = 0;

        }

    }
}