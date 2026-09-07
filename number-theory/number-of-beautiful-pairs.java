class Solution {
    public boolean isgcd(int x,int y){
        while(y!=0){
            int temp= y;
            y=x%y;
            x=temp;
        }
        return x==1;   
    }
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            int first=nums[i];
            while(first>=10){
                first/=10;
            }
            for(int j=i+1;j<nums.length;j++){
                int last=nums[j]%10;
                if(isgcd(first,last)){
                    count++;
                }
            }
        }
        return count;
    }
}