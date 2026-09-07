class Solution {
public:
    int maxArea(vector<int>& height) {
        int n= height.size();
        int l=0,r=n-1,vol=0,maxs=0;
        while(l<r){
            int x=min(height[l],height[r]);
            vol=x*(r-l);
            maxs=max(maxs,vol);
            if(x==height[l]){
                l++;
            }else{
                r--;
            }
        }
        return maxs;
    }

};