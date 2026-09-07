class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans =new ArrayList<>();
        if(n<2) return ans;
        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=n;i++){  
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }   
        }
        for(int x=2;x<=n/2;x++){
            int a=x;
            int b=n-x;
            if(prime[a] && prime[b]){
                ArrayList<Integer> sum=new ArrayList<>();
                sum.add(a);
                sum.add(b); 
                ans.add(sum);
            }
        }
        return ans;
    }
}