class Solution {
    public boolean canAliceWin(int[] nums) {

        int single = 0;
        int dble = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                single += nums[i];
            } else {
                dble += nums[i];
            }
        }

        if (single > dble || single < dble) {
            return true;
        } else {
            return false;
        }
        
    }
}