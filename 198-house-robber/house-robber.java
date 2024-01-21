class Solution {
    public int rob(int[] nums) {

        int f[]= new int[nums.length+1];

        f[1]= nums[0];
        for(int i=2;i<=nums.length;i++){
            f[i]=Math.max(nums[i-1]+f[i-2],f[i-1]);
        }
        return f[nums.length];
        
    }
}