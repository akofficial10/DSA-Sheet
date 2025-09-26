class Sheet {
    public void merge(int[] A, int m, int[] B, int n) {
        // Start filling A from the last index (combined length - 1)
        int idx = m + n - 1; 
        // Pointers for last valid element of A and last element of B
        int i = m - 1, j = n - 1;
        
        // Merge from the back while both arrays have elements
        while (i >= 0 && j >= 0) {
            if (A[i] >= B[j]) {
                // Place the larger element at the current index
                A[idx--] = A[i--];
            } else {
                A[idx--] = B[j--];
            }
        }

        // If B still has remaining elements, copy them into A
        while (j >= 0) {
            A[idx--] = B[j--];
        }
    }
}
