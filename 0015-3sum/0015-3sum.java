class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // extreme brute force solution O(n^3)
        // List<List<Integer>> ans = new ArrayList<>();

        // Arrays.sort(nums);

        // for (int i = 0; i < nums.length-2; i++) {

        //     if (i > 0 && nums[i] == nums[i-1]) {
        //         continue;
        //     } else {

        //         for (int j = i + 1; j < nums.length-1; j++) {

        //             if (j > i + 1 && nums[j] == nums[j - 1]) {
        //                 continue;
        //             } else {

        //                 for (int k = j + 1; k < nums.length; k++) {

        //                     if (k > j + 1 && nums[k] == nums[k - 1]) {
        //                         continue;
        //                     } else {

        //                         if (nums[i] + nums[j] + nums[k] == 0) {

        //                             // ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
        //                             List<Integer> temp = new ArrayList<>();

        //                             temp.add(nums[i]);
        //                             temp.add(nums[j]);
        //                             temp.add(nums[k]);

        //                             ans.add(temp);

        //                         }
        //                     }
                                
        //                 }
        //             }    

        //         }
        //     }
        // }

        // return ans

        // optimal solution using two pointer O(n^2)

        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    List<Integer> temp = new ArrayList<>(List.of(nums[i], nums[left], nums[right]));
                    ans.add(temp);
                    left++;
                    right--;

                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }

        return ans;


        
    }
}