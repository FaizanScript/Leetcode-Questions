class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] ans = new int[nums.length];

        int productbefore = 1;

        for (int i = 0; i < nums.length; i++) {
            ans[i] = productbefore;
            productbefore *= nums[i];
        }

        int productafter = 1;

        for (int i = nums.length-1; i >= 0; i--) {
            ans[i] *= productafter;
            productafter *= nums[i];
        } 
        return ans;
    }
}