class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] ans = new int[n][n];

        int top = 0;
        int right = n-1;
        int left =  0;
        int bottom = n-1;

        int element = 1;

        while (top <= bottom && left <= right) {

            // right traversal
            for (int i = left; i <= right; i++) {
                ans[top][i] = element;
                element++;
            }
            top++;

            // down traversal
            for (int i = top; i <= bottom; i++) {
                ans[i][right] = element;
                element++;
            }
            right--;

            // left traversal
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans[bottom][i] = element;
                    element++;
                }
                bottom--;
            }

            // up traversal
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[i][left] = element;
                    element++;
                }
                left++;
            }
        }
        return ans;


    }
}