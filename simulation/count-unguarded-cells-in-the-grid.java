class Solution {
    public int countUnguarded(int m, int n, int[][] gd, int[][] wl) {
        int[][] grid=new int[m][n];
        for(int i=0;i<gd.length;i++){
            int x=gd[i][0];
            int y=gd[i][1];
            grid[x][y]=1;
        }
        for(int i=0;i<wl.length;i++){
            int x1=wl[i][0];
            int y1=wl[i][1];
            grid[x1][y1]=2;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    //left
                    for(int a=j-1;a>=0;a--){
                        if(grid[i][a]==1 || grid[i][a]==2){
                            break;
                        }if(grid[i][a]==0){
                        grid[i][a]=3;
                        }
                    }
                    //down
                    for(int a1=i+1;a1<m;a1++){
                        if(grid[a1][j]==1 || grid[a1][j]==2){
                            break;
                        }
                        if(grid[a1][j]==0){
                        grid[a1][j]=3;
                        }
                    }
                    //right
                    for(int a2=j+1;a2<n;a2++){
                        if(grid[i][a2]==1|| grid[i][a2]==2){
                            break;
                        }
                        if(grid[i][a2]==0){
                        grid[i][a2]=3;
                        }
                    }
                    //top
                    for(int a3=i-1;a3>=0;a3--){
                        if(grid[a3][j]==1 || grid[a3][j]==2){
                            break;
                        } if(grid[a3][j]==0){
                        grid[a3][j]=3;
                        }
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==0){
                    count++;
                }
            }
        }
        return count;
    }
}