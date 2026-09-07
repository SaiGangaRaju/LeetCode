class Solution {
public:
    bool isVowel(char c){
        string v="aeiouAEIOU";
        return v.find(c)!=string::npos;

    }
    string reverseVowels(string s) {
       int i=0,j=s.size()-1;
       while(i<j){
        if(isVowel(s[i]) && isVowel(s[j])){
            swap(s[i],s[j]);
            i++;j--;
        }else if(!isVowel(s[j])){
            j--;
        }else{
            i++;
        }
       } 
       return s;
    }
};