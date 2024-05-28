class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int [] res=new int[n1];
        Map<Integer,Integer> map=new HashMap<>();
        int i=0,j=1; 
        while(i<n2)
        {
            if(j==n2)
            {
                map.put(nums2[i],-1);
                i++;
                j=i+1;
            }
            else if(nums2[i]<nums2[j])
            {
                 map.put(nums2[i],nums2[j]);
                i++;
                j=i+1;
            }
             else if(nums2[i]>nums2[j])
            {
              j++;
            }
        }

        for(int k=0;k<n1;k++)
        {
            res[k]=map.get(nums1[k]);
        }
       return res; 
    }
}