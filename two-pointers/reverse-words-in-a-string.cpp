class Solution {
public:
    string reverseWords(string s) {
        vector<string> v;
        string ans = "";
        stringstream ss(s);
        string temp;
        while(ss>>temp){
            v.push_back(temp);
        }
        reverse(v.begin(),v.end());
        for(int i = 0 ;i<v.size();i++){
            ans+=(v[i]);
            if(i!=v.size()-1)ans+=(" ");
        }
        return ans;
    }
};