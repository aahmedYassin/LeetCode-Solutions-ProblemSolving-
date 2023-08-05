class Solution {
 
     public int pivotIndex(int[] nums) {
        int index = -1, leftSum = 0, rightSum = 0;
        for (int i : nums) {
            rightSum += i;
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];

            if (rightSum == leftSum) {
                index = i;
                break;
            }
            leftSum += nums[i];

        }

        return index;
    }
}