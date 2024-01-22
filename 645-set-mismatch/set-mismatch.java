class Solution {
    public int[] findErrorNums(int[] nums) {
        int idx = 0;
        while (idx < nums.length) {
            int correctIdx = nums[idx] - 1;
            if (nums[idx] != nums[correctIdx]) 
                swap(nums, idx, correctIdx);
            else
                idx++;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i+1)
                continue;
            return new int[]{nums[i], i+1};
        }
        return new int[]{-1, -1};
    }
    
    public void swap(int[] arr, int i, int j) { 
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}