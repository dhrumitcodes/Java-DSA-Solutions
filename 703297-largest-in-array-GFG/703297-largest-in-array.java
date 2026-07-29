class Solution {
    public static int largest(int[] arr) {
        // code here
        int max_val=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max_val){
                max_val=arr[i];
            }
        }
        return max_val;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna