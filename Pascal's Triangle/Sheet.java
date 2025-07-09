import java.util.*;

class Sheet {
    // Method to generate Pascal's Triangle up to 'num' rows
    public List<List<Integer>> generate (int num){
        // Final answer: list of rows
        List<List<Integer>> result = new ArrayList<>();

        // If num is 0, return empty
        if(num == 0){
            return result;
        }

        // First row is always [1]
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        // If only 1 row needed, return
        if(num == 1){
            return result;
        }

        // Build next rows one by one
        for(int i = 1; i < num; i++){
            // Get the previous row
            List<Integer> prevRow = result.get(i-1);

            // Start new row with 1
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);

            // Fill middle values by adding two numbers from above
            for(int j = 0; j < prevRow.size() - 1; j++){
                row.add(prevRow.get(j) + prevRow.get(j + 1));
            }

            // End new row with 1
            row.add(1);

            // Add this row to result
            result.add(row);
        }

        // Return all rows
        return result;
    }
}
