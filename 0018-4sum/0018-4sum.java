class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        // brute force solution O(n^4)

    //    List<List<Integer>> ans = new ArrayList<>();

    //     Arrays.sort(nums);

    //     for (int i = 0; i < nums.length-3; i++) {
    //         if (i > 0 && nums[i] == nums[i-1]) {
    //             continue;
    //         }
    //         for (int j = i+1; j < nums.length-2; j++) {
    //             if (j > i+1 && nums[j] == nums[j-1]) {
    //                 continue;
    //             }
    //             for (int k = j+1; k < nums.length-1; k++) {
    //                 if (k > j+1 && nums[k] == nums[k-1]) {
    //                     continue;
    //                 }
    //                 for (int l = k+1; l < nums.length; l++) {
    //                     if (l > k+1 && nums[l] == nums[l-1]) {
    //                         continue;
    //                     }

    //                     long sum = (long) nums[i] + nums[j] + nums[k] + nums[l];

    //                     if (sum == target) {
    //                         List<Integer> temp = new ArrayList<>();

    //                         temp.add(nums[i]);
    //                         temp.add(nums[j]);
    //                         temp.add(nums[k]);
    //                         temp.add(nums[l]);

    //                         ans.add(temp);
    //                     }
    //                 }
    //             }
    //         }
    //     }

    //     return ans;


    // Optimal solution O(n^3) using two pointers

    List<List<Integer>> ans = new ArrayList<>();

    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
        if (i > 0 && nums[i] == nums[i-1]) {
            continue;
        }
        for (int j = i + 1; j < nums.length; j++) {
            if (j > i+1 && nums[j] == nums[j-1]) {
                continue;
            }

            int left = j + 1;
            int right = nums.length-1;

            while (left < right) {
                long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                if (sum == target) {
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);

                    ans.add(temp);

                    right--;
                    left++;

                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }

                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }

                } else if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                }
            }
        }
    }

    return ans;
        
    }
}