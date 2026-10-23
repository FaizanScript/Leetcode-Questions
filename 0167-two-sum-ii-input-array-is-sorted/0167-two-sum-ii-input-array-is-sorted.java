class Solution {
    public int[] twoSum(int[] numbers, int target) {

        // brute force solution O(n^2)

        // for (int i = 0; i < numbers.length-1; i++) {
        //     for (int j = i + 1; j < numbers.length; j++) {
        //         if (numbers[i] + numbers[j] == target) {
        //             return new int[]{i+1, j+1};
        //         }
        //     }
        // }
        // return new int[]{};

        // optimal solution using two pointers O(n)

        int left = 0;
        int right = numbers.length-1;

        while (left < right) {

            int sum = numbers[left] + numbers[right];

            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left+1, right+1};
            }
        }

        return new int[]{};
        
    }
}