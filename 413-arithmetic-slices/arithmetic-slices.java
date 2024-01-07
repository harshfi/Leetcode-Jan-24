class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count=0;
        int curr=0;
        for(int i=2;i<nums.length;i++){
            if((nums[i-1]-nums[i-2])==(nums[i]-nums[i-1])){
                curr++;
                count+=curr;
            }
            else{
                curr=0;
            }
        }
        return count;
    }
}