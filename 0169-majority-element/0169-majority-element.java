class Solution {
    public int majorityElement(int[] nums) {

        // brute force
        // for (int i = 0; i < nums.length; i++) {
        //         int count = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] == nums[j]) {
        //             count++;
        //         }
        //     }
        //     if (count > nums.length/2) {
        //         return nums[i];
        //     }
        // }
        // return -1;

        // using HashMap
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }

        return -1;
        
        
    }
}