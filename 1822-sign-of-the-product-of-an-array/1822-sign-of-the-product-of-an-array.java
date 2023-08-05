
class Solution {

    public int arraySign(int[] nums) {

        int product = 1;

        for (int i : nums) {
            if (i > 0) {
                product *= 1;
            } else if (i < 0) {
                product *= -1;
            } else {
                product *= i;
            }

        }

        if (product > 0) {
            return 1;
        } else if (product < 0) {

            return -1;
        } else {

            return 0;
        }

    }
}
