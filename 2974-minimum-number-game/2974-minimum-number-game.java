class Solution {
    public int[] numberGame(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-1;) {

            int temp = nums[i + 1];
            nums[i+1] = nums[i]; 
            nums[i] = temp;

            i += 2;

        }

        return nums;
        
    }
}