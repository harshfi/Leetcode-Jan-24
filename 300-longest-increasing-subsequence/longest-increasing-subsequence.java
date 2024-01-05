class Solution {
    public int lengthOfLIS(int[] nums) {
       return lis(nums);
    }
    private static int lis(int[] arr) {
		// TODO Auto-generated method stub
		int ans[]=new int[arr.length];
		ans[0]=arr[0];
		int len=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>ans[len-1])
			{
				ans[len]=arr[i];
				len++;
			}
			else {
				int idx=Search(ans,0,len-1,arr[i]);
				ans[idx]=arr[i];
			}
		
	}
		return len;
	}

	private static int Search(int[] ans, int i, int j, int item) {
		int idx=0;
		while(i<=j)
		{
			int mid=(i+j)/2;
			if(ans[mid]>=item) 
			{
				idx=mid;
				j=mid-1;
			}
			else {
				i=mid+1;
			}
		}
		// TODO Auto-generated method stub
		return idx;
	}
}