class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        // brute force solution (n^2)
        // int[] ans = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     int s = 0;
        //     for (int j = 0; j < nums.length; j++) {
        //         if (nums[i] > nums[j]) {
        //             s++;
        //         }
        //     }
        //     ans[i] = s;
        // }
        // return ans;


        // better solution (O(nlog n))
        // int[] sorted = nums.clone();
        // Arrays.sort(sorted);

        // int[] ans = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     int left = 0;
        //     int right = sorted.length;

        //     while (left < right) {
        //         int mid = left + (right - left) / 2;

        //         if (sorted[mid] >= nums[i]) {
        //             right = mid;
        //         } else {
        //             left = mid + 1;
        //         }
        //     }

        //     ans[i] = left;
        // }

        // return ans;


        // optimal solution
        int[] freq = new int[101];

        // Step 1: Count occurrences
        for (int num : nums) {
            freq[num]++;
        }

        // Step 2: Convert frequencies into prefix sums
        for (int i = 1; i < freq.length; i++) {
            freq[i] += freq[i - 1];
        }

        // Step 3: Build the answer
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] == 0 ? 0 : freq[nums[i] - 1];
        }

        return ans;

    }
}