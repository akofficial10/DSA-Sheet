import java.util.*;

class Sheet {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;  // Get the size of the grid (n x n)

        HashSet<Integer> set = new HashSet<>();  // To store unique numbers from the grid
        int a = -1, b = -1;  // 'a' will be the repeated number, 'b' will be the missing number

        int actualSum = 0;  // To store the sum of all elements present in the grid

        // Traverse the 2D grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int val = grid[i][j];  // Current cell value
                actualSum += val;      // Add it to the total sum

                // If the number already exists in the set, it's the repeated number
                if (set.contains(val)) {
                    a = val;
                }
                set.add(val);  // Add current value to the set
            }
        }

        int totalnums = n * n;  // Total numbers expected in the grid (1 to n^2)

        // Sum of first (n^2) natural numbers using the formula n(n+1)/2
        int expectedSum = totalnums * (totalnums + 1) / 2;

        // Using the difference between expected and actual sums to find the missing number:
        
        // expectedSum = actualSum - a + b  →  b = expectedSum + a - actualSum
        b = expectedSum + a - actualSum;

        // Return both repeated and missing numbers
        return new int[] { a, b };
    }
}
