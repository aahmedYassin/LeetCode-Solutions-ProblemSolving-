class Solution {
  public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer>removeDuplicate=new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {

            removeDuplicate.add(nums[i]);
        }

        for (int i = 1; i <= nums.length; i++) {

            if (!removeDuplicate.contains(i)) {

                missingNumbers.add(i);

            }

        }

        return missingNumbers;

    }
}