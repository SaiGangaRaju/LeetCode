class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int n= nums.size();
        int count=0;
        int maxs=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
                maxs=max(maxs,count);
            }else{
                count=0;
            }
        }
        return maxs;
    }
};