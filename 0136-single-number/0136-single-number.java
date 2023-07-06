class Solution {
   
    public int singleNumber(int[] nums) {

        Set<Integer> numbers = new TreeSet<>();
        int singleNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!numbers.contains(nums[i])) {
                numbers.add(nums[i]);
            } else {
                numbers.remove(nums[i]);

            }
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            singleNumber = iterator.next();
        }

        return singleNumber;

    }
}