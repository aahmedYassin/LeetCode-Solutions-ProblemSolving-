class Solution {
    public int[] twoSum(int[] nums, int target) {
        int indicies[] = new int[2];
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int complement=target-nums[i];
                if ( nums[j] == complement) {
                    indicies[0] = i;
                    indicies[1] = j;
                    break;
                }
            }
        }
        return indicies;
    }
}