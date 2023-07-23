class Solution {
    public boolean isHappy(int n) {
        Set<Integer> digitSum = new TreeSet<>();
        int sum = 0;
        while (true) {
            
            while (n > 0) {

                int remainder = n % 10;
                sum += Math.pow(remainder, 2);

                n = n / 10;
            }
            if (sum == 1) {
                return true;
            } else {
                boolean isExist = digitSum.add(sum);
                if (!isExist) {
                    return false;

                }
            }
            n = sum;
            sum=0;
        }
       
    }
}