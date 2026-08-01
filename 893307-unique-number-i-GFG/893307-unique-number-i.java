class Solution {
    public int findUnique(int[] nums) {
        // code here
        int result=0;
        for(int num: nums){
         result=result^num;
         }
         return result;
        }
    }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna