class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int actualSum = n;
        int expectedSum = 0;

        for (int i = 0; i < nums.length; i++) {
            actualSum += i;
            expectedSum += nums[i];
        }

        return actualSum - expectedSum;
        
    }
}