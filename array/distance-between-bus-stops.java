class Solution {
    public int distanceBetweenBusStops(int[] arr, int start, int dest) {
        int sum=0,acl=0,total=0;
        if(start>dest){
            int x=start;
            start=dest;
            dest=x;
        }
        for(int i=start;i<dest;i++){
            sum+=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            total+=arr[i];
        }
        acl=total-sum;

        return Math.min(acl,sum);
    
    }
}