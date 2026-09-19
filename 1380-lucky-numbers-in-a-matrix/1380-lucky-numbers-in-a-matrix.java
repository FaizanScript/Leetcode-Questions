class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int minvalue = matrix[i][0];
            int mincol = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minvalue) {
                    minvalue = matrix[i][j];
                    mincol = j;
                }
            }

            boolean lucky = true;

            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][mincol] > minvalue) {
                    lucky = false;
                    break;
                }
            }
            if (lucky) {
                ans.add(minvalue);
            }
        }
        
        return ans;
        
    }
}