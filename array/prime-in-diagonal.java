class Solution {
    public boolean isprime(int x){
        if(x<=1) return false;
        for(int i=2;i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int max=0;
       for(int i=0;i<nums.length;i++){
            if(isprime(nums[i][i])){
                    max=Math.max(max,nums[i][i]);
                }
            if(isprime(nums[i][nums.length-i-1])){
                    max=Math.max(max,nums[i][nums.length-i-1]);
                }
        } 
    return max;
    }
}