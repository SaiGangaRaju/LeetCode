class Solution {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> ls=new ArrayList();
        int sum=0;
        int ans=n;
        while(ans!=0){
            int temp=ans%10;
                ls.add(temp);
                ans/=10;
        }
        for(int i=0;i<ls.size() ;i++){
            if(i%2!=0){
                sum+=ls.get(i);
            }else{
                sum-=ls.get(i);
            }
        }
        return (ls.size() %2==0)? sum:-sum;
    }
}