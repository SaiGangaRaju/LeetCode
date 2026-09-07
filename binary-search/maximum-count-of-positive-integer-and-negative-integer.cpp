class Solution {
public:
    int maximumCount(vector<int>& nums) {
        int cp=0,cn=0;
       for(int i=0;i<nums.size();i++){
        if(nums[i]==0) continue;
        if(nums[i]<0) cn++;
        if(nums[i]>0) cp++;
       } 
       return max(cn,cp);
    }
};