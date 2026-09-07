class Solution {
public:
    int compress(vector<char>& chars) {
        int i=0,count=0,write=0;
        vector<char>ans;
        while(i<chars.size()){
            int j=i;
            while( j<chars.size() && chars[i]==chars[j]){ 
                j++;
            }
            count=j-i;
            chars[write++]=chars[i];
            if(count>1) {
                string sa= to_string(count);
                for(char x :sa ){
                    chars[write++]=x;
                }
            }
            i=j;
            count=0;
        }
        return write;
    }
};
