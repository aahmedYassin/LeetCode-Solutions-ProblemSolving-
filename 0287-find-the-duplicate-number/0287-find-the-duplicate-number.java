class Solution {
    public int findDuplicate(int[] nums) {

        int number = 0;
        boolean flag = false;
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            flag = uniqueNumbers.add(nums[i]);
            if (!flag) {
                number = nums[i];
            }

        }

        return number;

    }
}