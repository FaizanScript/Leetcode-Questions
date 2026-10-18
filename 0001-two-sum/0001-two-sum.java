class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // brute force solution
        // int[] ans = new int[2];

        // for (int i = 0; i < nums.length-1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             ans[0] = i;
        //             ans[1] = j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;

        // optimal solution (using hashmap)
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int needed = target - nums[i];
            if (seen.containsKey(needed)) {
                return new int[]{seen.get(needed), i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{};
    }
}