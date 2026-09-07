class Solution {
    public int findDelayedArrivalTime(int AT, int DT) {
       if(AT+DT>=24){
        return AT+DT-24;
       }else{
        return AT+DT;
       }
    }
}