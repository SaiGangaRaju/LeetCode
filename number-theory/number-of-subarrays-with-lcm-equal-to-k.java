class Solution {
    public int gcd(int x,int y){
        while(y!=0){
            int temp= x%y;
            x=y;
            y=temp;
        }
        return x;
    }
    public int subarrayLCM(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int lcm=1;
            for(int j=i;j<nums.length;j++){
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
            
            if(lcm==k){
                count++;
            }if(lcm>k) break;
            }
        }
        return count;
    }
}