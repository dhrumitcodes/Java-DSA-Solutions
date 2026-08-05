class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int golaindex = -1;

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                golaindex = i - 1;
                break;
            }
        } 
        if (golaindex != -1) {
            int swapindex = golaindex;
            for (int j = n - 1; j >= golaindex; j--) {
                if (nums[j] > nums[golaindex]) {
                    swapindex = j;
                    break;
                }
            }
            swap(nums, golaindex, swapindex);
        }
        reverse(nums, golaindex + 1, n - 1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna