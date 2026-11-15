class Solution {
    public void rotate(int[] nums, int k) {

    // Brute force solution
        // k = k % nums.length;

        // repeating th shifing k times
        // for (int i = 0; i < k; i++) {

        //     // pick up the last element
        //     int last = nums[nums.length-1];

        //      shifiting the element to the right by one position
        //     for (int j = nums.length-1; j > 0; j--) {
        //         nums[j] = nums[j-1];
        //     }

        //      Putting the saved last element at index 0.
        //     nums[0] = last;
        // }


    // Optimal solution
        int n = nums.length;

        k = k % n;


        reverse(nums, 0, n-k-1); // reversing the elements from 0 to k-1
        reverse(nums, n-k, n-1); // reversing the elements from k to last
        reverse(nums, 0, n-1); // reversing the whole array

        // alternative
        // reverse(nums, 0, n-1);
        // reverse(nums, 0, k-1);
        // reverse(nums, k, n-1);
     }

    public void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
 }