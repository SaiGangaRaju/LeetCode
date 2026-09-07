class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int maxs=0,alt=0;
        for(int i=0;i<gain.size();i++){
          alt= alt+gain[i];
            maxs=max(maxs,alt);
        }

        return maxs;
    }
};