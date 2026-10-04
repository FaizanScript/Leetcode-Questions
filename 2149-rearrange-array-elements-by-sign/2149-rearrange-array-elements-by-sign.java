class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];

        int[] positive = new int[nums.length/2];
        int[] negative = new int[nums.length/2];

        int p = 0;
        int n = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive[p] = nums[i];
                p++;
            } else {
                negative[n] = nums[i];
                n++;
            }
        } 

        for (int i = 0; i < nums.length/2; i++) {
            ans[i*2] = positive[i];
            ans[i*2+1] = negative[i];
        }

        return ans;
        
    }
}