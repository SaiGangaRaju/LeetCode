class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
        while(n !=0){
            int ans=n%k;
            sum+=ans;
            n=n/k;
        }
        return sum;
    }
}