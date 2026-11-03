class Solution {
    public void sortColors(int[] nums) {

        // optimal solution O(2n)
        // int red = 0;
        // int white = 0;
        // int blue = 0;

        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] == 0) {
        //         red++;
        //     } else if (nums[i] == 1) {
        //         white++;
        //     } else {
        //         blue++;
        //     }
        // }

        // // overwriting the array
        // int i = 0;

        // for (int j = 0; j < red; j++) {
        //     nums[i] = 0;
        //     i++;
        // }

        // for (int j = 0; j < white; j++) {
        //     nums[i] = 1;
        //     i++;
        // }

        // for (int j = 0; j < blue; j++) {
        //     nums[i] = 2;
        //     i++;
        // }


        // optimal solution using Dutch national flag algorithm O(n)

        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;

            } else if (nums[mid] == 1) {
                mid++;

            } else {
                swap(nums, mid, high);
                high--;
            }

        }

    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}