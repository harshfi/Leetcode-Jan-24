class Solution {
    int n=0;
    public int minFallingPathSum(int[][] matrix) {
        int ans=Integer.MAX_VALUE;
         n=matrix.length;
         int dp[][]=new int [n][n];
         for(int a[] : dp){
             Arrays.fill(a,-100000);
         }

        for(int j=0;j<matrix[0].length;j++){
           int sum1= find(matrix,0,j,dp);
          

            ans= Math.min(ans,sum1);
        }
        return ans;
        
    }
    public int find(int [] []matrix,int i ,int j,int [][]dp){
        if(i== n || j==n|| j<0) return Integer.MAX_VALUE;

        if(dp[i][j]!=-100000) return dp[i][j];

        int f=  find(matrix,i + 1,j - 1,dp);
        int s= find(matrix,i + 1, j,dp);
        int t=find(matrix,i + 1, j + 1,dp);
        if(f==s && s==t && f== Integer.MAX_VALUE) return matrix[i][j];

        return dp[i][j]=matrix[i][j] + Math.min(f,Math.min(s,t));
    }
}