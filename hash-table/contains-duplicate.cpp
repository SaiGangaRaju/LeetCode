class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        int l1=nums.size();
        sort(nums.begin(),nums.end());
        nums.erase(unique(nums.begin(),nums.end()),nums.end());
         int l2=nums.size();
        return !(l1==l2);
    }
};