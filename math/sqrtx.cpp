class Solution {
public:
    int mySqrt(int x) {
    long long i=1,j=x,ans=0;
    while(i<=j){
        long long mid=i+(j-i)/2;
        if(mid*mid==x){
            return mid;
        }
        if( mid*mid<x){
            ans=mid;
            i=mid+1;
        }else{
            j=mid-1;
        }
    }
    return ans;
    }
};