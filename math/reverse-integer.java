class Solution {
    public int reverse(int x) {
        int i=x;long a=0;
        while(i!=0){
            int temp=i%10;
            a=a*10+temp;
            i/=10;
        }
        if(a<Integer.MIN_VALUE || a>Integer.MAX_VALUE){
            return 0;
        }
        return (int)a;
    }
}