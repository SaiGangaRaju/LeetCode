class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        ArrayList<Integer> ls= new ArrayList();
        int m=mat.length;
        int n=mat[0].length;
        int top=0, bottom=m-1,left=0,right=n-1;
        while(top<=bottom && left<=right){
            for(int j=left;j<=right;j++){
                ls.add(mat[top][j]);
            }
                top++;
            for(int i=top;i<=bottom;i++ ){
                ls.add(mat[i][right]); 
            }
                right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ls.add(mat[bottom][j]);
                }
                    bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ls.add(mat[i][left]);
                }
                    left++;
            }   
        }
        return ls;
    }
}