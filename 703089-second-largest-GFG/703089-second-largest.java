class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=-1;
        int second_largest=-1;
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                second_largest=largest;
                largest=arr[i];
             
            }
            else if(arr[i]>second_largest && arr[i]!=largest){
                second_largest=arr[i];
                
            }
        }
        return second_largest;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna