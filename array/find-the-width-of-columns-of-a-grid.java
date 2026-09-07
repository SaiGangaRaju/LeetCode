class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int ans[]=new int[n]; 
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=0;j<m;j++){
                String s= String.valueOf(grid[j][i]);
                max=Math.max(max,s.length());
            }
            ans[i]=max;
        }
        return ans;
    }
}