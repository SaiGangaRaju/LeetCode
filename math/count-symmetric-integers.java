class Solution {
    public boolean issum(String x){
        int sum1=0,sum2=0;
        for(int i=0;i<x.length()/2;i++){
            sum1+=x.charAt(i)-'0';  
        }
        for(int i=x.length()/2;i<x.length();i++){
            sum2+=x.charAt(i)-'0';
        }
        return sum1==sum2;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String num=String.valueOf(i);
            if(((num.length())%2)!=0) continue;
            if(issum(num)) count++;
        }
    return count;
    }
}