class Solution {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        int gcdVal = gcd(a, b);
        return (a * b) / gcdVal;
    }

    static int[] lcmAndGcd(int a, int b) {
        int lcmVal = lcm(a, b);
        int gcdVal = gcd(a, b);
        int[] result = {lcmVal, gcdVal};
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna