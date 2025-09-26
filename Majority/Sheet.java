package Majority;

class Sheet {
    public int majorityElement(int[] nums){
        // Initialize frequency counter and candidate for majority element
        int freq = 0, ans = 0;

        // Iterate through the array
        for(int i = 0; i < nums.length; i++){
            // If frequency is 0, assign current element as candidate
            if(freq == 0){
                ans = nums[i];
            }

            // If current element matches candidate, increase frequency
            if(ans == nums[i]){
                freq++;
            } else {
                // Otherwise, decrease frequency
                freq--;
            }
        }

        // Return the candidate (guaranteed majority element by problem constraints)
        return ans;
    }
}
