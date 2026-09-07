class Solution {
    public String categorizeBox(long l, long w, long h, long m) {
        int bulky=0,heavy=0;
       if( (l>=10000 || w>=10000 || h>=10000) ||((l*w*h)>=1000000000)){
            bulky=1 ;
        }
        if(m>=100) {
            heavy=1;
        }    
        if(bulky==1 && heavy==1){
            return "Both";
        }else if(bulky==0 && heavy==0){
            return "Neither";
        }else if(bulky==1 && heavy==0){
            return "Bulky";
        }else{
            return "Heavy";
        }
    }
}