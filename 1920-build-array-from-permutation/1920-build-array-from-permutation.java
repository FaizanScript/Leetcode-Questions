class Solution {
    public int[] buildArray(int[] nums) {

        // int[] ans = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = nums[nums[i]];
        // }
        // return ans;

        // follow up: without using an extra space(i.e., O(1)memory)

        int n = nums.length; // the constraint says that the nums[i] is not bigger than nums length

        // Encoding (storing the original value and the future answer together in the same cell.)
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }

        // decode (Remove the original value and keep only the future answer.)
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}