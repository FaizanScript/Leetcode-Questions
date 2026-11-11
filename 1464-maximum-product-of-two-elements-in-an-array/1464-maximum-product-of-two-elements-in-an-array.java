class Solution {
    public int maxProduct(int[] nums) {

        // using bubble sort algorithm
        // int i = 0;
        // while (i < 2) {
        //     int j = 0;
        //     while (j < nums.length - i - 1) {
        //         if (nums[j] > nums[j+1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;
        //             j++;
        //         }
        //         else {
        //             j++;
        //         }
        //     }
        //     i++;
        // }

        // return (nums[nums.length-2]-1) * (nums[nums.length-1]-1);


        // fastest solution

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max1) {
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max2 = nums[i];
            }
        }

        return (max1-1) * (max2-1);
        
    }
}