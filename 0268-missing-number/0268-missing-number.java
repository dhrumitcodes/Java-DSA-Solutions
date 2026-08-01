class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        

        int expectedSum = n * (n + 1) / 2;
    
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        return expectedSum - actualSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna