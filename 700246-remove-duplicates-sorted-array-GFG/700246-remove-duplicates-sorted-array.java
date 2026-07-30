class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result= new ArrayList<>();
        result.add(arr[0]);
        
        for(int i=1; i<arr.length ;i++){
            if(arr[i] !=arr[i-1]){
                result.add(arr[i]);
            }
        }
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna