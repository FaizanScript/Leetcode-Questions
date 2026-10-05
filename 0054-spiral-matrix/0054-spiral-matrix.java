class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<>();

        // the spiral boundaries that will be shink after every traversal
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;


        // this loop is for valid rectangle and run depends on the matrix dimenstion 
        while (top <= bottom && left <= right) {

            // Right traversal
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]); // fixed row is top
            }
            top++;

            // down traversal
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]); // fixed column is right
            }
            right--;

            // left traversal
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]); // fixed row is bottom
                }
                bottom--;
            }

            // up traversal
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]); // fixed column is left
                }
                left++;
            }

        }
        return ans;

    }
}