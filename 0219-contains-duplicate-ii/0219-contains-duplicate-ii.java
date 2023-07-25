class Solution {
   
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag = false;

        Map<Integer, Integer> numbers = new TreeMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (numbers.containsKey(nums[i])) {
                if (Math.abs(i - numbers.get(nums[i])) <= k) {
                    flag = true;
                    break;
                } else {
                    numbers.put(nums[i], i);

                }
            } else {
                numbers.put(nums[i], i);
            }
        }

        return flag;
    }
}