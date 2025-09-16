public class Sheet {
    // Function to find the maximum subarray sum using Kadane's Algorithm
    public int maxSubArray(int[] nums) {
        int currSum = 0;  // Stores current subarray sum
        int maxSum = Integer.MIN_VALUE;  // Stores maximum subarray sum (initialized to smallest possible value)

        // Traverse through all elements of the array
        for(int i = 0; i < nums.length; i++){
            currSum = currSum + nums[i];  // Add current element to the running sum

            maxSum = Math.max(currSum, maxSum);  // Update maxSum if currSum is greater

            // If currSum becomes negative, reset it to 0 (start a new subarray)
            if(currSum < 0){
                currSum = 0;
            }
        }

        return maxSum;  // Return the maximum subarray sum found
    }
}
