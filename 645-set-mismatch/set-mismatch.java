class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[]= new int[2];
        boolean find[] = new boolean[nums.length+2];


        Arrays.sort(nums);

        for(int i=1;i<nums.length;i++){
          
          if(nums[i]==nums[i-1]){
            ans[0]=nums[i];
            for(int j=0;j<nums.length;j++){

                find[nums[j]]=true;
                
            }
            for(int j=1;j<nums.length+1;j++){
                if(find[j]==false){
                    ans[1]=j;
                    break;
                }
            }
            return ans;
          }
         
        }

      return ans;
        
    }
}