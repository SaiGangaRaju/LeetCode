class Solution {
    public void rotate(int[][] arr) {
        int m=arr.length;
        int n=arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=i+1;j<n;j++){
                if(i!=j){
                    int x=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=x;
                }
            }
        }
        for(int i=0;i<m;i++){
            int l=0,r=n-1;
            while(l<=r){
                int tp =arr[i][l];
                arr[i][l]=arr[i][r];
                arr[i][r]=tp;
                l++;r--;
            }
        }
    }
}