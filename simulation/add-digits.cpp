class Solution {
public:
    int addDigits(int num) {
        int  i=num,count=0;
      while(i>=10) {
        string temp=to_string(i);
        int count=0;
        for(int k=0;k<temp.length();k++){
            count+=temp[k]-'0';
        }
        i=(count);
      } 
      return i;
    }
};