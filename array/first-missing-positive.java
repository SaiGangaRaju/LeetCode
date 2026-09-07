class Solution {
    public int firstMissingPositive(int[] nums) {
       HashSet<Integer> set=new HashSet<>();
       for(int x: nums){
        set.add(x);
       }
       int i=1;
        while(set.contains(i)){
            i++;
        }
        return i;
    }
}