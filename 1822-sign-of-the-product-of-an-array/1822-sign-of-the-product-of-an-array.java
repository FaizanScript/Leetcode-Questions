class Solution {
    public int arraySign(int[] nums) {

        int product = 1;

        int negativeCount = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                negativeCount++;
            }
        }

        if (negativeCount % 2 == 0) {
            return 1;
        } else {
            return -1;
        }

        // return signFunc(product);
        
    }

    // public int signFunc(int product) {

    //     if (product > 0) {
    //         return 1;
    //     } else if (product == 0) {
    //         return 0;
    //     } else {
    //         return -1;
    //     }
    // }
}