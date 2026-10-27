class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // brute force solution O(n^2)
        // ArrayList<Integer> ans = new ArrayList<>();

        // for (int i = 1; i <= nums.length; i++) {

        //     boolean found = false;

        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[j] == i) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         ans.add(i);
        //     }
        // }

        // return ans;

        // better solution using hashset O(n) time and space both
        // HashSet<Integer> set = new HashSet<>();

        // ArrayList<Integer> ans = new ArrayList<>();

        // for (int num : nums) {
        //     set.add(num);
        // }

        // for (int i = 1; i <= nums.length; i++) {
        //     if (!set.contains(i)) {
        //         ans.add(i);
        //     }
        // }

        // return ans;

        // optimal solution O(n)
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] > 0) {
                nums[index] = -nums[index];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;

        
    }
}