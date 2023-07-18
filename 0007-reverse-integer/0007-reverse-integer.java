class Solution {
   
    
    public int reverse(int x) {

        List<Long> numbers = new ArrayList<>();
        long sum = 0L, factor = 1L;
        int number = Math.abs(x);

        while (number > 0) {

            long remainder = number % 10;

            numbers.add(remainder);

            number = number / 10;

        }

        for (int i = numbers.size() - 1; i >= 0; i--) {

            sum += numbers.get(i) * factor;
            factor *= 10;

        }
        if (x < 0) {
            sum *= -1;
        }

        if (Math.pow(2, 31) - 1 < sum || sum < Math.pow(-2, 31)) {
            sum = 0;
        }

        return (int)sum;

    }
} 