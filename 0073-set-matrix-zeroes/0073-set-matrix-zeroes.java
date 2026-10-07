class Solution {
    public void setZeroes(int[][] matrix) {
        
    // Brute force solution

    // store the row and col of the element which has zero
    //     boolean[] row = new boolean[matrix.length];
    //     boolean[] col = new boolean[matrix[0].length];

    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             if (matrix[i][j] == 0) {
    //                 row[i] = true;
    //                 col[j] = true;
    //             }
    //         }
    //     }

    // // to make the cell zero if the row or col is true
    //     for (int i = 0; i < matrix.length; i++) {
    //         for (int j = 0; j < matrix[i].length; j++) {
    //             if (row[i] == true || col[j] == true) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }


        //  optimal solution

        // Phase 1 — Remember whether first row/column originally contain zero
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // for col checking wheather it contains zero
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
            }
        }

        // for row checking wheather it contains zero
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] == 0) {
                firstRowZero = true;
            }
        }

        // Phase 2 — Use the matrix itself as markers
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {

                    // mark this row
                    matrix[i][0] = 0;
                    
                    // mark this col
                    matrix[0][j] = 0;
                }
            }
        }

        // Phase 3 — Use the markers to zero the inside
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][0] == 0|| matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Phase 4 — Finally handle first row and first column
        if (firstRowZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

    }
}