class Solution {
    public int maximumWealth(int[][] acc) {
        int sum=0;
        int m=acc.length;
        int n=acc[0].length;
        int x=Integer.MIN_VALUE;
        while(m!=0){
            m--;sum=0;
            for(int i=0;i<n;i++){
                sum+=acc[m][i];
            }
            x=Math.max(x,sum);
        }
        return x; 
    }
}