class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        for (int rotation = 0; rotation < 4; rotation++) {

            if(isEqual(mat, target)) {
                return true;
            }

            mat = rotate90(mat);
        }
        return false;
    }

    public int[][] rotate90(int[][] mat) {

        int n = mat.length;
        int[][] ans = new int[n][n];

        // transpose
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[j][i] = mat[i][j];
            }
        }

        // reverse
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;

            while(left < right) {
                int temp = ans[i][left];
                ans[i][left] = ans[i][right];
                ans[i][right] = temp;
                left++;
                right--;
            }
        }
        return ans;
    }

    public boolean isEqual(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}