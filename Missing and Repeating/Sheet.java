import java.util.*;

class Sheet {
      public int[] findMissingAndRepeatedValues(int[][] grid){
        int n = grid.length;

        HashSet<Integer> set = new HashSet<>();
        int a=-1, b=-1;

        int actualSum = 0;

        for(int i = 0; i<n; i++){
            for( int j = 0; j<n; j++){
                int val = grid[i][j];
                actualSum = actualSum + val;

                if(set.contains(val)){
                    a = val;
                }
                set.add(val);
            }
        }

        int totalnums = n*n;
        int expectedSum = totalnums * (totalnums + 1)/2;

        b = expectedSum + a - actualSum;

        return new int[] {a, b};
      }
}
