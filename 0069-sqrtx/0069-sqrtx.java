class Solution {
    public int mySqrt(int x) {
        if(x<2) return x;
        long left=1;
         long right=x/2;

        while(left<=right){
            long mid=left+(right-left)/2;
            long square=mid*mid;
            if(square==x) return (int)mid;
            if(square<x)  left=mid+1;
            else right=mid-1;

        }
         return (int)right;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna