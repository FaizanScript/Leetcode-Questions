class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {

        // The ans two array to store the cordinates
        int[][] ans = new int[rows * cols][2];

        // to Keep track of our current position
        int row = rStart;
        int col = cStart;

        // to Keep track of how many valid cells we've recorded
        int count = 0;


            // Record the starting cell
            ans[count][0] = row;
            ans[count][1] = col;
            count++;


        // the step distance (to control How many individual movements should I make in the current direction?)
        int steps = 1;

        while (count < rows * cols) {

            // right walk
            for (int i = 0; i < steps; i++) {

                col++; // move right

                if (row >= 0 && row < rows &&
                 col >= 0 && col < cols) { // to check if its inside the grid

                    ans[count][0] = row;
                    ans[count][1] = col;
                    count++;

                }

            }

            // down walk
            for (int i = 0; i < steps; i++) {

                row++; // move down

                if (row >= 0 && row < rows &&
                 col >= 0 && col < cols) { // to check if its inside the grid

                    ans[count][0] = row;
                    ans[count][1] = col;
                    count++;

                }
            }

            // increase steps
            steps++;


            // left walk
            for (int i = 0; i < steps; i++) {

                col--; // move left

                if (row >= 0 && row < rows &&
                 col >= 0 && col < cols) { // to check if its inside the grid

                    ans[count][0] = row;
                    ans[count][1] = col;
                    count++;

                }
            }

            // up walk
            for (int i = 0; i < steps; i++) {

                row--; // move up

                if (row >= 0 && row < rows &&
                 col >= 0 && col < cols) { // to check if its inside the grid

                    ans[count][0] = row;
                    ans[count][1] = col;
                    count++;

                }
            }

            // increase steps
            steps++;
        }

        return ans;
        
    }
}