class Solution {
    public int cherryPickup(int[][] grid) {

        int dp[][][]= new int [grid.length+1][grid[0].length+1][grid[0].length+1];

        for(int i[][]: dp){
            for(int j[]: i){
                Arrays.fill(j,-1);
            }
        }

        return find(grid,0,0,grid[0].length-1,dp);
        
    }
    public int find(int grid [][], int i, int j1,int j2 ,int dp[][][]){

        

        if(j1>=grid[0].length|| j2>=grid[0].length || j1<0 || j2<0){
            return -1000000;
        }
        if(dp[i][j1][j2]!= -1) return dp[i][j1][j2];
        if(i == grid.length-1){
            if(j1==j2) return grid [i][j1];
            else return grid[i][j1]+grid[i][j2]; 
        }
        int max=-1000000;
        for( int dj1=-1;dj1<=1;dj1++){

            for(int dj2=-1;dj2<=1;dj2++){

                int value = 0;

                if(j1==j2) value = grid [i][j1];
                else value = grid [i][j1]+ grid [i][j2];
                
                value = value + find(grid,i+1,j1+dj1, j2+dj2,dp);

                max= Math.max(max,value);

            }
        }
        return  dp[i][j1][j2]=max;
    }
}