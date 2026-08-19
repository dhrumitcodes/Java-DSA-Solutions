class Solution {
    public int reverseBits(int n) {
        int result = 0;
        while (n > 0) {
            int lastBit = n & 1;       
            result = (result << 1) | lastBit; 
            n = n >> 1;                
        }
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna