class Solution {
    public int countDigits(int num) {

        int copy = num;

        int count = 0;

        while (copy != 0) {
            int rem = copy % 10;
            if (num % rem == 0) {
                count++;
            }
            copy = copy / 10;
        }
        return count;
        
    }
}