class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];


    // Brute force Solution

        // creating two variables positive and negative to store the positive and negative element in org order.
        // the lenght is half of the nums array since the nums has even no of length and the psotive and negative elements are equally distributed so the which is nums.length/2
        // int[] positive = new int[nums.length/2];
        // int[] negative = new int[nums.length/2];

        // these are the index of the positive and negative
        // int positiveIndex = 0;
        // int negativeIndex = 0;

        // putting the positive and negative elements of nums in separate psoitive and negative array
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] > 0) {
        //         positive[positiveIndex] = nums[i];
        //         positiveIndex++;
        //     } else {
        //         negative[negativeIndex] = nums[i];
        //         negativeIndex++;
        //     }
        // } 

        // merging the positive and negative array
        // for (int i = 0; i < ans.length/2; i++) {
        //     ans[i*2] = positive[i]; // i*2 is the even index
        //     ans[i*2+1] = negative[i]; // i*2+1 is the odd index
        // }


    // Optimal solution

    // initializing the positive and negative index because the positive elements sould go to even index and negative go to odd index
        int evenIndex = 0;
        int oddIndex = 1;

    // putting the psotive and negative elements in ans as even odd order
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[evenIndex] = nums[i];
                evenIndex += 2;
            } else {
                ans[oddIndex] = nums[i];
                oddIndex += 2;
            }
        }

        return ans;
        
    }
}