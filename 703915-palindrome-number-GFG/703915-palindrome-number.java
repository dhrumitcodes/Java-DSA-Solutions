class Solution {
    public boolean isPalindrome(int n) {
        long original = Math.abs((long) n);  
        long num = original;
        long reversed = 0;

        while (num > 0) {
            long lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num / 10;
        }

        return reversed == original;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna