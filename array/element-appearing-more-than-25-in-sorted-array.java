class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length==1) return arr[0];
        int idx=0,count=0;
     for(int i=1;i<=arr.length;i++){
        if(arr[i-1]==arr[i]){
            count++;
        }else{
            count=0;
        }
        if(count>=(arr.length/4)){
            return arr[i];
        }
     }   
     return count;
    }
}