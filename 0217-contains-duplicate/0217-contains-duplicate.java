class Solution {
     public boolean containsDuplicate(int[] nums) {
        Set<Integer> setUniqueNumbers = new HashSet<Integer>();
        boolean checkCountAtLeastTwiceFlag = true;
        for (int i = 0; i < nums.length; i++) {
            if (setUniqueNumbers.add(nums[i])) {
                checkCountAtLeastTwiceFlag = false;
            } else {
                checkCountAtLeastTwiceFlag = true;
                break;
            }
        }
        return checkCountAtLeastTwiceFlag;
    }
}