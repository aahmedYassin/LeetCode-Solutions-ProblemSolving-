class Solution {
   public double findMaxAverage(int[] nums, int k) {
        double avg = 0.0;
        double sum = 0.0;
        for (int i = 0; i <= 0; i++) {

            for (int j = i; j < i + k; j++) {

                sum += nums[j];
            }

            avg = sum / k;
        }

        int i = 0, j = i + k;
        while (j < nums.length) {

            sum -= nums[i];
            sum+=nums[j];
            avg = Math.max(avg, sum / k);
            i++;
            j++;
        }
        return avg;

    }
}