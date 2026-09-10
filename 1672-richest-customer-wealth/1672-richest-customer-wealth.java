class Solution {
    public int maximumWealth(int[][] accounts) {

        int richest = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentwealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentwealth += accounts[i][j];
            }
            if (currentwealth >= richest) {
                richest = currentwealth;
            }
        }
        return richest;
        
    }
}