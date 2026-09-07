class Solution {
    public int diagonalSum(int[][] mat) {
        int x=0;
        if(mat.length==1){
            return mat[0][0];
        }
        int sum=0;int m=mat.length;
        for(int i=0;i<m;i++){
                sum+=(mat[i][i])+mat[i][mat.length-i-1];
            }
         if(mat.length%2!=0){
                 x=(mat[(mat.length/2)][mat.length/2]);
                sum-=x;
            }
        return sum;
    }
}