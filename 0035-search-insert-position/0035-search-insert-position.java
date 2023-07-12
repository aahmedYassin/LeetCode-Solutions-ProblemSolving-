class Solution {
     public int searchInsert(int[] nums, int target) {

        int left = 0, right = nums.length - 1, index = -1, mid = 0;

        while (left <= right) {
            mid = (right + left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (target > nums[mid]) {
                left = mid + 1;

            } else if (target < nums[mid]) {
                right = mid - 1;

            }

        }
        if (index == -1) {
            if (nums[mid] > target) {
                index = mid;

            } else {
                index = mid + 1;

            }

        }
        return index;
    }
}