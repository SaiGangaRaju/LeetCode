class Solution {
    public int totalMoney(int n) {
        int sum=0;
        if(n<=7){
            return (int)(n*(n+1))/2;
        }
            for(int i=1;i<=n;i++){
                if(i%7==0){
                    sum+=6+(i/7);
                }else{
                sum+=(i%7)+(i-1)/7;
                }
            }
    return sum;
    }
}