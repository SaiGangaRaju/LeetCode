class Solution {
    public boolean canConstruct(String rns, String mag) {
        int[] arr =new int[26];

        for(int i=0;i<mag.length();i++){
            arr[mag.charAt(i)-'a']++;
        }
        for(int i=0;i<rns.length();i++){
            arr[rns.charAt(i)-'a']--;
        }
        for(int j=0;j<=25;j++){
            if(arr[j]<0) return false;
        }
        return true;
    }
}