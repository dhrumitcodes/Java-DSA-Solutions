class Solution {
    public void sortColors(int[] nums) {
      int i=0;
      int j=0;
      int k=nums.length-1;
      while(j<=k){
     if (nums[j]==0){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        i++;
        j++;
     }  else if(nums[j]==1){
        j++;
     }  else{
        int temp=nums[j];
        nums[j]=nums[k];
        nums[k]=temp;
        k--;
     } 

    }

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna