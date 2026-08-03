class Solution {
    public int maxSubArray(int[] nums) {
       int maxSum=nums[0];
       int currsum=0;
       for(int num:nums){
        currsum += num;
        maxSum = Math.max(currsum, maxSum);

        if(currsum<0){
            currsum=0;
        }
       } 
       return maxSum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna