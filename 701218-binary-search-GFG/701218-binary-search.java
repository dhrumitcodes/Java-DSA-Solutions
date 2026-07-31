class Solution {
    public boolean binarySearch(int[] arr, int k) {
      
      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return true; 
            }
        }
        
        return false; 
    }
}
        
 

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna