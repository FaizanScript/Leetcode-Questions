class Solution {
    public int thirdMax(int[] nums) {

        long max = Long.MIN_VALUE;
        long secMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                thirdMax = secMax;
                secMax = max;
                max = nums[i];

            } else if (nums[i] < max && nums[i] > secMax) {
                thirdMax = secMax;
                secMax = nums[i];
            } else if (secMax > nums[i] && nums[i] > thirdMax) {
                thirdMax = nums[i];
            }
        }
        return thirdMax != Long.MIN_VALUE ? (int) thirdMax : (int) max;
        
    }
}