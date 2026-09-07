class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int count=nums.size(),i=0,b=nums.size()-1;
        while(i<=b){
            if(nums[i]==val){
                int temp=nums[i];
                nums[i]=nums[b];
                nums[b]=temp;
                b--;
                count--;
               }else{
                i++;
               }
        }
        return count;
    }
};