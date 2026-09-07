class Solution {
    public boolean isPrime(int n){
        if(n<2){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }

        return true;
    }

    public int numPrimeArrangements(int n) {
        int prc=0,fact=1,fact1=1;

        for(int i=1;i<=n;i++){
            if(isPrime(i)){
                prc++;
            }
        }

        for(int i=1;i<=prc;i++){
            fact=(int)((long)fact*i%1000000007);
        }

        for(int i=1;i<=n-prc;i++){
            fact1=(int)((long)fact1*i%1000000007);
        }

        return (int)((long)fact*fact1%1000000007);
    }
}