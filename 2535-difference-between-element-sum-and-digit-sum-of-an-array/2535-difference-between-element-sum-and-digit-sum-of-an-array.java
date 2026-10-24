class Solution {
    public int differenceOfSum(int[] nums) {

        int x = 0;
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            x += nums[i];
            if (nums[i] >= 10) {
                while (nums[i] != 0) {
                    int rem = nums[i] % 10;
                    y += rem;
                    nums[i] = nums[i] / 10;
                }
            } else {
                y += nums[i];
            }
        }

        return x - y;
        
    }
}