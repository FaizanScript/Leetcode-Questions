class Solution {
    public int maxProduct(int[] nums) {

        int i = 0;
        while (i < 2) {
            int j = 0;
            while (j < nums.length - i - 1) {
                if (nums[j] > nums[j+1]) {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    j++;
                }
                else {
                    j++;
                }
            }
            i++;
        }

        return (nums[nums.length-2]-1) * (nums[nums.length-1]-1);
        
    }
}