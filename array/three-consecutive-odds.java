class Solution {
    public boolean isodd(int x){
        return (x%2!=0);
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        if(arr.length<3) return false;
        int count=0;
        for(int i=0;i<arr.length-2;i++){  
            if(isodd(arr[i+1]) && isodd(arr[i]) && isodd(arr[i+2])){
                return true;
            }
        }
        return false;
    }
}