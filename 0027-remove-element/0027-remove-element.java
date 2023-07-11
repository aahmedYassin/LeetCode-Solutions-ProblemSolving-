class Solution {
     public int removeElement(int[] nums, int val) {

        int counter = 0;
        int j = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                counter++;

            }
        }



        return counter;
    }
}