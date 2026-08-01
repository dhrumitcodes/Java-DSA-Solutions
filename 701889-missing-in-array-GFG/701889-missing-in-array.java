class Solution {
int missingNum(int arr[]) {
        long n = arr.length + 1;
        
        long expectedSum = n * (n + 1) / 2;
        
        long actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        
        return (int) (expectedSum - actualSum);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna