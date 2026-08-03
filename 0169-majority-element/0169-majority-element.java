class Solution {
    public int majorityElement(int[] nums) {
     int n=nums.length;
     int count=0;
     Integer maj=null;

     for(int i=0;i<n;i++){
        if(count==0){
            count=1;
            maj=nums[i];
        } else if(nums[i]==maj){
            count++;
        } else{
            count--;
        }  
     } 
     return maj;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna