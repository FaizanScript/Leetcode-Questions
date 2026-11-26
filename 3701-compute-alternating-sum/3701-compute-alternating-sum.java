class Solution {
    public int alternatingSum(int[] nums) {

        int ans = 0;

        int even = 0;
        int odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
            ans += nums[even];
            even += 2;
            } else {
                ans -= nums[odd];
                odd += 2;
            }
        }

        return ans;
        
    }
}