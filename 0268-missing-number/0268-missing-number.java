class Solution {
    public int missingNumber(int[] nums) {
        
        int actualSum=0,sum=0;
        for(int i=0;i<nums.length;i++){
            actualSum+=nums[i];
        }
        
          for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
          
          return sum-actualSum;
        
    }
}