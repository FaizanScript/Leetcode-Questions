class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;

        for (int i = 0; i < mat.length; i++) {
            int primary = mat[i][i];
            int secondary = mat[i][mat.length-1-i];
            
            sum += primary;
            if (i != mat.length-1-i) {
                sum += secondary;
            }
        }
        return sum;

    }
}