class Solution {
public:
    int peakIndexInMountainArray(vector<int>& nums) {
        int i=1,j=nums.size()-2;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid-1]<nums[mid]&& nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(nums[mid-1]<nums[mid]){
                i=mid+1;
            }else{
                j=mid-1;
            }
        }
        return -1;
    }
};