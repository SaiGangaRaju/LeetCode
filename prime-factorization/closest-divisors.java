class Solution {
    public int[] closestDivisors(int num) {
        double x=num;
        for(int i=(int)Math.sqrt(x+2);i>0;i--){
            if((num+1)%i==0){
                return new int[]{i, (num + 1) / i};
            }
            if((num+2)%i==0){
                return new int[]{i, (num + 2) / i};
            }
        }
        return new int[] {};
    }
}