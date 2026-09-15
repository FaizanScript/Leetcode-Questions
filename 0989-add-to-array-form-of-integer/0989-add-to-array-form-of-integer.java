class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans = new ArrayList<>();

        int i = num.length-1;
        int carry = 0;

        while (i >= 0 || k > 0 || carry > 0) {

            int digitFromNum = 0;

            if (i >= 0) {
                digitFromNum = num[i];
            }

            int digitFromK = k % 10;

            int sum = digitFromNum + digitFromK + carry;

            ans.add(0, sum % 10);   // store digit at front

            carry = sum / 10;       // carry for next position

            k /= 10;
            i--;
        
        }
        return ans;        
    }
}