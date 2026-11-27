class Solution {
    public int[] transformArray(int[] nums) {

        int zeroes = 0;
        int ones = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                zeroes++;
            } else {
                ones++;
            }
        }

        for (int i = 0; i < zeroes; i++) {
            nums[i] = 0;
        }

        for (int i = zeroes; i < zeroes + ones; i++) {
            nums[i] = 1;
        }

        return nums;


        
    }
}