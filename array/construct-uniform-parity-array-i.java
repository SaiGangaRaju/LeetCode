class Solution {
    public boolean uniformArray(int[] nums1) {
        int count=0,c1=0;
      int nums2[]=new int[nums1.length];
    for(int i=0;i<nums1.length;i++){
        if(nums1[i]%2==0){
            count++;
        }else{
            c1++;
        }
    }
    if(count==nums1.length || c1==nums1.length){
      return true;
    }else{
        count=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1.length;j++){
                if( j!=i && nums1[i]%2!=0){
                    nums2[j]=nums1[i]-nums1[j];
                }
                nums2[j]=nums1[i];
            }

        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]%2!=0){
                count++;
            }
        }
        if(count==nums2.length){
              return true;
        }
    }
    return true;
    }
}