class Solution {
    public int numIdenticalPairs(int[] nums) {

        int goodpair = 0;

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if ( nums[i] == nums[j] && i < j) {
                    goodpair++;
                }
            }
        }

        return goodpair;
    }
}