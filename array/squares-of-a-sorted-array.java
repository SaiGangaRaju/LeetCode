class Solution {
    public int[] sortedSquares(int[] nums) {
       int i=0,j=nums.length-1;
       int[] arr =new int[nums.length];
       int idx=arr.length-1;
       while(i<=j){
        if(Math.abs(nums[i])<Math.abs(nums[j])){
            arr[idx--]=nums[j]*nums[j];
            j--;
        }else{
            arr[idx--]=nums[i]*nums[i]; 
            i++;
        }
       } 
       return arr;
    }
}