class Solution {
    public int findNumbers(int[] nums) {

        // int count = 0;

        // for (int i =  0; i < nums.length; i++) {
        //     int digits = 0;
        //     int num = nums[i];
        //     while (num != 0) {
        //         digits++;
        //         num = num / 10;
        //     }

        //     if (digits % 2 == 0) {
        //         count++;
        //     }
        // }
        // return count;

        // optimal
        // int count = 0;
        // for (int num : nums) {
        //     // Check if the number has 2, 4, or 6 (up to 100,000) digits
        //     if ((num >= 10 && num <= 99) || 
        //         (num >= 1000 && num <= 9999) || 
        //         num == 100000) {
        //         count++;
        //     }
        // }
        // return count;

        // optimal 2
        int count=0;

        for(int ele : nums){
            if(((int)Math.log10(ele)+1) % 2==0){
                count++;
            }
        }
        return count;

        
    }
}