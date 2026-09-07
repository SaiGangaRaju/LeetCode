class Solution {
    public boolean isPalindrome(int x) {
    if(x<0){
    return false;
    }
    StringBuilder sb=new StringBuilder(String.valueOf(x));
    int j=sb.length()-1;
    int i=0;
    while(i<j){
        if(sb.charAt(i)!=sb.charAt(j)){
            return false;
        }
            i++;j--;
        }
        return true;
    }
}