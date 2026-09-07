class Solution {
    public int accountBalanceAfterPurchase(int pa) {
        int bal=100;
        if(pa%10<5){
            pa-=pa%10;
        }else if (pa%10==5){
            pa+=5;
        }else{
            pa-=pa%10;
            pa+=10;
        }
        return bal-pa;
    }
}