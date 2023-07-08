class Solution {
      public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE, sum = 0;

        int start = 0, end = 0;

        while (end < nums.length) {

            sum += nums[end];
            end++;
            while (sum >= target) {
                minLen = Math.min(minLen, end - start);
                sum -= nums[start];
                start++;

            }

        }
        if (minLen == Integer.MAX_VALUE) {
            minLen = 0;
        }
        return minLen;

    }
}