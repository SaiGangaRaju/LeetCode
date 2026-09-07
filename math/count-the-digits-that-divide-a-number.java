class Solution {
    public int countDigits(int num) {
        int count=0;
        int ans=num;
        while(ans!=0){
            int x= ans%10;
            if(num%x==0){
                count++;
            }
            ans=ans/10;
        }
    return count;
    }
}