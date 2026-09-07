class Solution {
public:
    bool isHappy(int x) {
       while(x!=1&& x!=4){
        long long sum=0;
        while(x>0){
            long  long rem=x%10;
            sum=sum+(rem*rem);
            x/=10;
        }
        x=sum;
        sum=0;
       } 
       return x==1;

    }
};