class Solution {
public:
    int numWaterBottles(int nbot, int nexc) {
    int count=nbot,temp=nbot;
    while(temp>=nexc) {
       int rem=temp/nexc;
        count+=rem;
        temp=(rem)+(temp%nexc);
    }
    return count;
    }
};