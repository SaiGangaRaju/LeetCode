class Solution {
    public double largestTriangleArea(int[][] points) {
        double ans=0,a=0;
        int l=points.length;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                for(int k=j+1;k<l;k++){
                    int x1=points[i][0], y1=points[i][1],x3=points[k][0],y3=points[k][1],x2=points[j][0],y2=points[j][1];
                    a= (0.5)*(Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
                    ans=Math.max(ans,a);
                }
            }
        }
        return ans;
    }
}