class Sheet {
    public void setZeroes(int[][] matrix) {

        // Check if first row or first column has any zero
        boolean firstRow = false, firstCol = false;

        // Step 1: Go through all cells to find 0s
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    
                    // If 0 is in first row, remember it
                    if (i == 0) {
                        firstRow = true;
                    }

                    // If 0 is in first column, remember it
                    if (j == 0) {
                        firstCol = true;
                    }

                    // Mark this column to be zeroed
                    matrix[0][j] = 0;

                    // Mark this row to be zeroed
                    matrix[i][0] = 0;
                }
            }
        }

        // Step 2: Set cells to 0 if their row or column was marked
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {

                // If this row or column is marked, set cell to 0
                if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 3: Zero entire first row if needed
        if (firstRow) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[0][j] = 0;
            }
        }

        // Step 4: Zero entire first column if needed
        if (firstCol) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
