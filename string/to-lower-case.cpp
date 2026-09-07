class Solution {
public:
    string toLowerCase(string s) {
        string ans;
        for(char c:s){
            if(c>=65 && c<=90){
                ans.push_back(c+32);
            }else{
                ans.push_back(c);
            }
           
        }
        return ans;
    }
};