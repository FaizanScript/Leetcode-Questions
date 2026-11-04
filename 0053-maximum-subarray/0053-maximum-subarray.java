class Solution {
    public int maxSubArray(int[] nums) {

        // brute force solution O(n^2)

        // int max = Integer.MIN_VALUE;

        // for (int i = 0; i < nums.length; i++) {

        //     int currentSum = 0;
            
        //     for (int j = i; j < nums.length; j++) {

        //         currentSum += nums[j];
        //         max = Math.max(currentSum, max);
        //     }
        // }

        // return max;

        // if (nums.length == 1) {
        //     return nums[0];
        // }

        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            
            currentSum += nums[i];

            maxSum = Math.max(currentSum, maxSum);

            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
        
    }
}