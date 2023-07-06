class Solution {
     public List<Integer> findDuplicates(int[] nums) {

        List<Integer> duplicateNumbers = new ArrayList<>();
        Set<Integer> uniqueNumbers = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            boolean flag = uniqueNumbers.add(nums[i]);
            if (!flag) {
                duplicateNumbers.add(nums[i]);
            }
        }

        return duplicateNumbers;
    }
}