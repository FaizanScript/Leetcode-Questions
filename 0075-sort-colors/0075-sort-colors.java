class Solution {
    public void sortColors(int[] nums) {

        int red = 0;
        int white = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 1) {
                white++;
            } else {
                blue++;
            }
        }

        int i = 0;

        for (int j = 0; j < red; j++) {
            nums[i] = 0;
            i++;
        }

        for (int j = 0; j < white; j++) {
            nums[i] = 1;
            i++;
        }

        for (int j = 0; j < blue; j++) {
            nums[i] = 2;
            i++;
        }

        
        
    }
}